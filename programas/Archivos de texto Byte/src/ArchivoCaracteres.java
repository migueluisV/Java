import java.io.File; //Clase para trabajar con archivos y rutas.
import java.io.FileNotFoundException; //Excepción en caso de que no se encuentra un archivo o ruta.
import java.io.FileWriter; //Clase para crear objeto con posiblidad de escritura de archivos.
import java.io.PrintWriter; //Clase para crear flujo de escritura en archivos.
import java.io.FileReader; //Clase para crear objeto con posiblidad de lectura de archivos.
import java.io.BufferedReader; //Clase para crear flujo de lectura de archivos.

import java.io.IOException; //Excepción en caso de que haya error durante escritura o lectura de archivos.
import java.util.InputMismatchException; //Excepción en caso de error de formato en variables.
import java.util.Scanner;

public class ArchivoCaracteres {
    public Scanner lectura = new Scanner(System.in);

    public void Menu() throws IOException, InterruptedException{
        File archivo = new File("lib/"); //Crea objeto File con la ruta lib/ del directorio de este proyecto.
        String[] archivos_lib = archivo.list(); //Arreglo de strings que recibe la lista de archivos o directorios que existen en el objeto File.
        byte Op;
        String nombre;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        try{
            System.out.println("-Selecciona una opción del menú-\n");
            System.out.println("1) Crear archivo.\n2) Leer archivo.\n3) Salir del programa.");
            System.out.printf("Opción: "); Op = lectura.nextByte();
            lectura.nextLine(); //Limpia buffer de entrada de datos.

            switch(Op){
                case 1:
                    System.out.printf("Escribe el nombre del archivo (extensión .txt únicamente): "); nombre = lectura.nextLine();
                    CrearArchivo(nombre); //Pasa el nombre del archivo al método de crear archivos.
                    break;
                case 2:
                    System.out.println("\nLista de los archivos almacenados en lib/ para leer:");
                    for (String archivos : archivos_lib) { //Imprime la lista de archivos existentes en la ruta del objeto File declarado arriba.
                        System.out.println(archivos); 
                    }
                    System.out.printf("Selecciona un archivo a leer escribiendo su nombre: "); nombre = lectura.nextLine();
                    LeerArchivo(nombre); //Pasa el nombre del archivo al método de lectura de archivos.
                    break;
                case 3:
                    System.out.println("Programa finalizado...");
                    System.exit(0); //Finaliza el programa sin errores y con exito.
                    break;
                default:
                    System.out.println("La opción ingresada no es válida.");
                    System.in.read();
                    Menu();
            }
        }catch (InputMismatchException e){
            System.out.println("Error de formato.");
            lectura.nextLine(); //Limpia buffer de entrada de datos.
            Menu();
        }
    }

    public void CrearArchivo(String nombre) throws InterruptedException, IOException{
        FileWriter archivo = null; //Declara objeto FileWriter como nulo.
        PrintWriter pw = null; //Declara objeto PrintWriter como nulo.
        String linea;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        try{
            archivo = new FileWriter("lib/" + nombre); //El objeto FileWriter recibe la ruta y nombre del archivo a escribir.
            pw = new PrintWriter(archivo); //El objeto PrintWriter está listo para escribir en el archivo.

            System.out.println("-Escribe el contenido del fichero. Finalice cada línea con un ENTER. Finalice la escritura dejando una línea vacía con un ENTER-\n");
            linea = lectura.nextLine(); //Variable que recibe las lineas de texto que queremos ingresar.

            while (linea.length() != 0){ //Escribe en el archivo mientras haya carácteres a escribir.
                pw.println(linea); //Escribe la variable en el archivo.
                linea = lectura.nextLine();
            }
        } catch(IOException e){
            System.out.println("Error: " + e);
            System.out.println("Ruta del error: "); e.printStackTrace();
        } finally{
            try{
                if (null != archivo){ //Cierra los objetos FileWriter y PrintWriter.
                    archivo.close();
                    pw.close();
                    System.out.println("Guarado en lib/ con éxito.");
                }
            } catch(IOException e2){
                System.out.println("Error: " + e2);
                System.out.println("Ruta del error: "); e2.printStackTrace();
            }
        }

        System.out.printf("Presione ENTER para regresar al Menú...");
        System.in.read(); //Espera a que el usuario presione ENTER para continuar.
        Menu();
    }

    public void LeerArchivo(String nombre) throws IOException, InterruptedException{
        FileReader fr = null; //Declara objeto FileReader como nulo.
        BufferedReader br = null; //Declara objeto BufferedReader como nulo.
        String linea;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        try{
            fr = new FileReader("lib/" + nombre); //El objeto FileReader recibe la ruta y nombre del archivo a leer.
            br = new BufferedReader(fr); //El objeto BufferedReader está listo para leer en el archivo.

            System.out.printf("---Contenido de %s---\n\n", nombre);
            while ((linea = br.readLine()) != null){ //Escribe en pantalla mientras el objeto BufferedReader encuentre caracteres en el archivo.
                System.out.println(linea);
            }
        } catch (FileNotFoundException e){
            System.out.println("Error: el archivo no existe o no se encontró.");
        } finally{
            if (null != fr){ //Cierra los objetos FileReader y BufferedReader.
                fr.close();
                br.close();
            }
        }

        System.out.printf("\nPresione ENTER para regresar al Menú...");
        System.in.read();
        Menu();
    }
}