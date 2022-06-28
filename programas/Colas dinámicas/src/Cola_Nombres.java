import java.io.IOException; //Excepción si hay error durante entrada y salida de datos.
import java.util.InputMismatchException; //Excepción si hay un error de formato en tipos de datos.
import java.util.Iterator;
import java.util.Queue; //Clase para trabajar con colas dinámicas.
import java.util.Scanner;

public class Cola_Nombres{
    public Scanner lectura = new Scanner(System.in);

    public void Menu(Queue<String> Nombres) throws InterruptedException, IOException{
        int Op;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        System.out.println("-Cola de nombres-\n");
        
        try{
            System.out.printf("Nombres registrados: %s\n", Nombres.size());
            System.out.println("\n-Menú-\n1) Insertar nombre.\n2) Eliminar nombre.\n3) Vaciar cola.\n4) Buscar nombre.\n5) Recorrer cola.\n6) Salir.");
            System.out.print("Selecciona una opción: "); Op = lectura.nextInt();
            lectura.nextLine(); //Limpia buffer de entrada de datos.
    
            switch(Op){
                case 1:
                    AgregarNombre(Nombres);
                    break;
                case 2:
                    EliminarNombre(Nombres);
                    break;
                case 3:
                    VaciarCola(Nombres);
                    break;
                case 4:
                    BuscarNombre(Nombres);
                    break;
                case 5:
                    RecorrerNombres(Nombres);
                    break;
                case 6:
                    lectura.close(); //Cierra el objeto Scanner.
                    System.exit(0); //Cierra el programa.
                    break;
                default:
                    System.out.println("Selecciona una opción del menú mostrado.");
                    lectura.nextLine(); //Limpia buffer de entrada de datos.
                    Menu(Nombres);
            }
        } catch(InputMismatchException e){
            System.out.println("Error de formato.");
            lectura.nextLine(); //Limpia buffer de entrada de datos.
            Menu(Nombres);
        }
    }

    private void RecorrerNombres(Queue<String> nombres) throws InterruptedException, IOException {
        int i;
        Iterator<String> n = nombres.iterator();
        
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        if (nombres.size() == 0){
            System.out.print("Pila vacia. Presione ENTER para continuar...");
            System.in.read(); //Espera a que se presione ENTER para continuar.
            Menu(nombres);
        } else{
            System.out.println("---Alumnos con sus promedios---\n");
            for(i = 0; i < nombres.size(); i++){
                System.out.printf("%s - %s\n", i + 1, n.next());
            }
        }
        System.out.print("\nPresione ENTER para regresar al menú...");
        System.in.read(); //Espera a que se presione ENTER para continuar.
        Menu(nombres);
    }

    private void BuscarNombre(Queue<String> nombres) throws InterruptedException, IOException {
        String nombre;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        if (nombres.size() == 0){
            System.out.print("Pila vacia. Presione ENTER para continuar...");
            System.in.read(); //Espera a que se presione ENTER para continuar.
            Menu(nombres);
        } else{
            System.out.print("Ingresa el nombre a buscar: "); nombre = lectura.nextLine();
            if (nombres.contains(nombre) == true)
                System.out.println("Se encontró el nombre.");
            else
                System.out.print("No se encontró el alumno");
            System.out.print("\nPresione ENTER para regresar al menú...");
            System.in.read(); //Espera a que se presione ENTER para continuar.
            Menu(nombres);
        }
    }

    private void VaciarCola(Queue<String> nombres) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        if (nombres.size() == 0){
            System.out.print("Cola vacia. Presione ENTER para continuar...");
            System.in.read(); //Espera a que se presione ENTER para continuar.
            Menu(nombres);
        } else{
            nombres.clear(); //Limpia la cola.
            System.out.print("La cola Nombres fue vaciada. Presiona ENTER para regresar al menú...");
            System.in.read(); //Espera a que se presione ENTER para continuar.
            Menu(nombres);
        }
    }

    private void EliminarNombre(Queue<String> nombres) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        if (nombres.size() == 0){
            System.out.print("Cola vacia. Presione ENTER para continuar...");
            System.in.read(); //Espera a que se presione ENTER para continuar.
            Menu(nombres);
        } else{
            System.out.printf("El nombre %s fue eliminado. Presiona ENTER para regresar al menú...", nombres.poll()); //Elimina el objeto en la cima de la cola.
            System.in.read(); //Espera a que se presione ENTER para continuar.
            Menu(nombres);
        }
    }

    private void AgregarNombre(Queue<String> nombres) throws InterruptedException, IOException {
        int Op;
        String nombre;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        try{
            System.out.print("Ingresa un nombre: "); nombre = lectura.nextLine();
            
            nombres.add(nombre); //Agrega elemento String a la cola.
            System.out.print("\nIngresado. ¿Desea seguir agregando alumnos? Si[1]: "); Op = lectura.nextInt();
            lectura.nextLine(); //Limpia buffer de entrada de datos.
            
            if (Op == 1)
                AgregarNombre(nombres);
            else
                Menu(nombres);
        } catch(InputMismatchException e){
            System.out.println("Error de formato.");
            lectura.nextLine(); //Limpia buffer de entrada de datos.
            AgregarNombre(nombres);
        }
    }
}