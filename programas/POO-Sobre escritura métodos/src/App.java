import java.io.IOException; //Excepción si hay error durante entrada y salida de datos.
import java.util.InputMismatchException; //Excepción si hay un error de formato en tipos de datos.
import java.util.Scanner;

public class App {
    private static Scanner lectura = new Scanner(System.in);

    public static void ValoresArea(double r, double a) throws InterruptedException, IOException{
        double radio = 0, altura = 0;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        System.out.println("-Valores para calcular áreas de figuras-\n");
        try{
            System.out.printf("Ingresa un valor para radio: "); radio = lectura.nextDouble();
            System.out.printf("Ingresa un valor para altura: "); altura = lectura.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Error de formato.");
            lectura.nextLine(); //Limpia buffer de entrada de datos.
            ValoresArea(radio, altura);
        }

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        Circulo circulo = new Circulo(radio);
        circulo.ImprimirArea();

        Esfera esfera = new Esfera(radio);
        esfera.ImprimirArea();

        Cilindro cilindro = new Cilindro(radio, altura);
        cilindro.ImprimirArea();
    }

    public static void main(String[] args) throws Exception {
        ValoresArea(0, 0);
    }
}
