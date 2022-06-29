import java.io.IOException; //Excepción si hay error durante entrada y salida de datos.
import java.util.InputMismatchException; //Excepción si hay un error de formato en tipos de datos.
import java.util.Scanner;

public class App {
    public static Scanner lectura = new Scanner(System.in);
    private static float[] Calificaciones = new float[10];

    private static void Menu() throws InterruptedException, IOException{
        int Op;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        try{
            System.out.println("Ordenamiento de burbuja y tipos\n");
            System.out.println("-Menú-\n1) Burbuja simple.\n2) Burbuja mejorada.\n3) Burbuja optimizada.\n4) Salir.");
            System.out.print("Selecciona una opción: "); Op = lectura.nextInt();
            lectura.nextLine(); //Limpia buffer de entrada de datos.
    
            switch(Op){
                case 1:
                    BurbujaSimple();
                    break;
                case 2:
                BurbujaMejorada();
                    break;
                case 3:
                BurbujaOptimizada();
                    break;
                case 4:
                    lectura.close(); //Cierra el objeto Scanner.
                    System.exit(0); //Cierra el programa
                    break;
                default:
                    System.out.println("Selecciona una opción del menú mostrado. Presiona ENTER para continuar...");
                    lectura.nextLine(); //Limpia buffer de entrada de datos.
                    Menu();
            }
        } catch(InputMismatchException e){
            System.out.println("Error de formato.");
            lectura.nextLine(); //Limpia buffer de entrada de datos.
            Menu();
        }
    }

    private static void BurbujaSimple() throws InterruptedException, IOException{
        String[] Nombres = new String[10];
        String aux;
        int i, j;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        System.out.println("Ordenamiento de burbuja simple\n");
        System.out.println("Ingresa 10 nombres:");
        for (i = 0; i < 10; i++){
            System.out.printf("%s- ", i + 1); Nombres[i] = lectura.nextLine();
        }

        //Ordenamiento de burbuja simple ascendente.
        for (i = 0; i < 10; i++){
            for (j = 0; j < 9; j++){
                if (Nombres[j].compareTo(Nombres[j + 1]) > 0){
                    aux = Nombres[j];
                    Nombres[j] = Nombres[j + 1];
                    Nombres[j + 1] = aux;
                }
            }
        }

        //Despliegue de resultados.
        System.out.println("\nNombres ordenados:");
        for (i = 0; i < 10; i++){
            System.out.printf("%s - %s\n", i + 1, Nombres[i]);
        }

        System.out.print("\nPresione ENTER para regresar al menú...");
        System.in.read(); //Espera a que se presione ENTER para continuar.
        Menu();
    }

    private static void BurbujaMejorada() throws InterruptedException, IOException{
        int i, j;
        float aux;
        boolean bandera = true;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        try{
    
            System.out.println("Ordenamiento de burbuja mejorado\n");
            System.out.println("Ingresa 10 calificaciones:");
            for (i = 0; i < 10; i++){
                System.out.printf("%s- ", i + 1); Calificaciones[i] = lectura.nextFloat();
                lectura.nextLine(); //Limpia buffer de entrada de datos.
            }
    
            //Ordenamiento de burbuja mejorado ascendente.
            for (i = 0; (i < 9) && (bandera == true); i++){
                bandera = false;
                for (j = 0; j < 10 - i - 1; j++){
                    if (Calificaciones[j] < Calificaciones[j + 1]){
                        bandera = true;
                        aux = Calificaciones[j];
                        Calificaciones[j] = Calificaciones[j + 1];
                        Calificaciones[j + 1] = aux;
                    }
                }
            }
    
            //Despliegue de resultados.
            System.out.println("\nCalificaciones ordenados:");
            for (i = 0; i < 10; i++){
                System.out.printf("%s - %s\n", i + 1, Calificaciones[i]);
            }
    
            System.out.print("\nPresione ENTER para regresar al menú...");
            System.in.read(); //Espera a que se presione ENTER para continuar.
            Menu();            
        } catch(InputMismatchException e){
            System.out.println("Error de formato.");
            lectura.nextLine(); //Limpia buffer de entrada de datos.
            BurbujaMejorada();
        }
    }

    private static void BurbujaOptimizada() throws InterruptedException, IOException{
        String[] NombresMascotas = new String[10];
        String aux;
        boolean ordenado;
        int i, j;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        System.out.println("Ordenamiento de burbuja simple\n");
        System.out.println("Ingresa 10 nombres para mascotas:");
        for (i = 0; i < 10; i++){
            System.out.printf("%s- ", i + 1); NombresMascotas[i] = lectura.nextLine();
        }

        //Ordenamiento de burbuja optimizado descendente
        i = 1;
        do{
            i++;
            ordenado = true;
            for (j = 0; j < 9; j++){
                if (NombresMascotas[j].compareTo(NombresMascotas[j + 1]) < 0){
                    ordenado = false;
                    aux = NombresMascotas[j];
                    NombresMascotas[j] = NombresMascotas[j + 1];
                    NombresMascotas[j + 1] = aux;
                }
            }
        } while(i < 10 && ordenado != true);

        //Despliegue de resultados.
        System.out.println("\nNombres de mascotas ordenados:");
        for (i = 0; i < 10; i++){
            System.out.printf("%s - %s\n", i + 1, NombresMascotas[i]);
        }

        System.out.print("\nPresione ENTER para regresar al menú...");
        System.in.read(); //Espera a que se presione ENTER para continuar.
        Menu();
    }

    public static void main(String[] args) throws Exception {
        Menu();
    }
}
