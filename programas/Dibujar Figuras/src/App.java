import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    static void Menu() throws InterruptedException, IOException, InputMismatchException{
        Scanner lectura = new Scanner(System.in);
        Figuras figura = new Figuras();
        byte Op;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        try{
            System.out.println("Selecciona una opción del menú:\n");
            System.out.println("1) Dibujar triángulo.\n2) Dibujar rectángulo.\n3) Dibujar cuadrado.\n4) Salir.");
            System.out.printf("Opción: "); Op = lectura.nextByte();
            lectura.nextLine();

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
                    System.exit(0);
                break;
                default:
                    System.out.print("Ingresa un valor del menú proporcionado. Presiona ENTER para continuar.");
                    System.in.read();
                    Menu();
            }
        } catch(InputMismatchException e){
            System.out.print("Error de formato.\n");
            lectura.nextLine();
            Menu();
        }
    }

    public static void main(String[] args) throws Exception {
        Menu();
    }
}
