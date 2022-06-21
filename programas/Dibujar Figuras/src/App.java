import java.io.IOException; //Excepción si hay error durante entrada y salida de datos.
import java.util.InputMismatchException; //Excepción si hay un error de formato en tipos de datos.
import java.util.Scanner;

public class App {
    static Scanner lectura = new Scanner(System.in);

    static void Menu() throws InterruptedException, IOException, InputMismatchException{
        Figuras figura = new Figuras();
        byte Op;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        try{
            System.out.println("Selecciona una opción del menú:\n");
            System.out.println("1) Dibujar triángulo.\n2) Dibujar rectángulo.\n3) Dibujar cuadrado.\n4) Salir.");
            System.out.printf("Opción: "); Op = lectura.nextByte();
            lectura.nextLine(); //Limpia buffer de entrada de datos.

            switch(Op){
                case 1:
                    figura.DibujarTriangulo();
                    Menu();
                    break;
                case 2:
                    figura.DibujarRectangulo();
                    Menu();
                    break;
                case 3:
                    figura.DibujarCuadrado();
                    Menu();
                    break;
                case 4:
                    lectura.close();
                    System.exit(0); //Salida del programa.
                break;
                default:
                    System.out.print("Ingresa un valor del menú proporcionado. Presiona ENTER para continuar.");
                    System.in.read(); //Espera a que se presione ENTER para continuar.
                    Menu();
            }
        } catch(InputMismatchException e){
            System.out.print("Error de formato.\n");
            lectura.nextLine(); //Limpia buffer de entrada de datos.
            Menu();
        }
    }

    public static void main(String[] args) throws Exception {
        Menu();
    }
}
