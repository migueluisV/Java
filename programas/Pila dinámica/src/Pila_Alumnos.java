import java.io.IOException; //Excepción si hay error durante entrada y salida de datos.
import java.util.InputMismatchException; //Excepción si hay un error de formato en tipos de datos.
import java.util.Stack; //Clase para trabajar con pilas dinámicas.
import java.util.Scanner;

public class Pila_Alumnos {
    public Scanner lectura = new Scanner(System.in);
    
    public void Menu(Stack<Double> Prom, Stack<String> Alum) throws InterruptedException, IOException{
        int Op;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        System.out.println("-Pila de alumnos con sus promedios-\n");
        
        try{
            System.out.printf("Alumnos registrados: %s\n", Alum.size());
            System.out.println("\n-Menú-\n1) Insertar alumno.\n2) Eliminar alumno.\n3) Vaciar pila.\n4) Buscar alumno.\n5) Recorrer pila.\n6) Salir.");
            System.out.print("Selecciona una opción: "); Op = lectura.nextInt();
            lectura.nextLine(); //Limpia buffer de entrada de datos.
    
            switch(Op){
                case 1:
                    AgregarAlumno(Prom, Alum);
                    break;
                case 2:
                    EliminarAlumno(Prom, Alum);
                    break;
                case 3:
                    VaciarPila(Prom, Alum);
                    break;
                case 4:
                    BuscarAlumno(Prom, Alum);
                    break;
                case 5:
                    RecorrerAlumnos(Prom, Alum);
                    break;
                case 6:
                    lectura.close(); //Cierra el objeto Scanner.
                    System.exit(0); //Cierra el programa.
                    break;
                default:
                    System.out.println("Selecciona una opción del menú mostrado.");
                    lectura.nextLine(); //Limpia buffer de entrada de datos.
                    Menu(Prom, Alum);
            }
        } catch(InputMismatchException e){
            System.out.println("Error de formato.");
            lectura.nextLine(); //Limpia buffer de entrada de datos.
            Menu(Prom, Alum);
        }
    }

    public void AgregarAlumno(Stack<Double> Prom, Stack<String> Alum) throws InterruptedException, IOException{
        int Op;
        String nombre;
        double promedio;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        try{
            System.out.print("Ingresa un nombre: "); nombre = lectura.nextLine();
            System.out.print("Ingresa un promedio: "); promedio = lectura.nextDouble();
            lectura.nextLine(); //Limpia buffer de entrada de datos.
            
            Alum.push(nombre); //Agrega elemento String a la pila.
            Prom.addElement(promedio); //Agrega un objeto a la pila.
            System.out.print("\nIngresado. ¿Desea seguir agregando alumnos? Si[1]: "); Op = lectura.nextInt();
            lectura.nextLine(); //Limpia buffer de entrada de datos.

            if (Op == 1)
                AgregarAlumno(Prom, Alum);
            else
                Menu(Prom, Alum);
        } catch(InputMismatchException e){
            System.out.println("Error de formato.");
            lectura.nextLine(); //Limpia buffer de entrada de datos.
            AgregarAlumno(Prom, Alum);
        }
    }

    public void EliminarAlumno(Stack<Double> Prom, Stack<String> Alum) throws InterruptedException, IOException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        if (Alum.size() == 0){
            System.out.print("Pila vacia. Presione ENTER para continuar...");
            System.in.read(); //Espera a que se presione ENTER para continuar.
            Menu(Prom, Alum);
        } else{
            System.out.printf("El alumno %s con promedio %s fue elimniado. Presiona ENTER para regresar al menú...", Alum.peek(), Prom.peek());
            Alum.pop(); //Elimina el objeto en la cima de la pila.
            Prom.pop(); //Elimina el objeto en la cima de la pila.
            System.in.read(); //Espera a que se presione ENTER para continuar.
            Menu(Prom, Alum);
        }
    }

    public void VaciarPila(Stack<Double> Prom, Stack<String> Alum) throws InterruptedException, IOException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        if (Alum.size() == 0){
            System.out.print("Pila vacia. Presione ENTER para continuar...");
            System.in.read(); //Espera a que se presione ENTER para continuar.
            Menu(Prom, Alum);
        } else{
            Alum.clear(); //Limpia la pila.
            Prom.clear(); //Limpia la pila.
            System.out.print("Las pilas Alumnos y Promedios fueron vaciadas. Presiona ENTER para regresar al menú...");
            System.in.read(); //Espera a que se presione ENTER para continuar.
            Menu(Prom, Alum);
        }
    }

    public void BuscarAlumno(Stack<Double> Prom, Stack<String> Alum) throws InterruptedException, IOException{
        String nombre;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        if (Alum.size() == 0){
            System.out.print("Pila vacia. Presione ENTER para continuar...");
            System.in.read(); //Espera a que se presione ENTER para continuar.
            Menu(Prom, Alum);
        } else{
            System.out.print("Ingresa el nombre a buscar: "); nombre = lectura.nextLine();
            if (Alum.contains(nombre) == true){
                System.out.printf("Se encontró el alumno, tiene promedio de %s.", Prom.elementAt(Alum.indexOf(nombre)));
                System.out.print("\nPresione ENTER para regresar al menú...");
                System.in.read(); //Espera a que se presione ENTER para continuar.
                Menu(Prom, Alum);
            } else
                System.out.print("No se encontró el alumno. Presione ENTER para regresar al menú...");
            System.in.read(); //Espera a que se presione ENTER para continuar.
            Menu(Prom, Alum);
        }
    }

    public void RecorrerAlumnos(Stack<Double> Prom, Stack<String> Alum) throws InterruptedException, IOException{
        int i;
        
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        if (Alum.size() == 0){
            System.out.print("Pila vacia. Presione ENTER para continuar...");
            System.in.read(); //Espera a que se presione ENTER para continuar.
            Menu(Prom, Alum);
        } else{
            System.out.println("---Alumnos con sus promedios---\n");
            for(i = 0; i < Alum.size(); i++){
                System.out.printf("%s - %s\n", Alum.elementAt(i), Prom.elementAt(i));
            }
        }
        System.out.print("\nPresione ENTER para regresar al menú...");
        System.in.read(); //Espera a que se presione ENTER para continuar.
        Menu(Prom, Alum);
    }
}