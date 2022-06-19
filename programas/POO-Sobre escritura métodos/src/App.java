import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static Scanner lectura = new Scanner(System.in);

    public static void ValoresArea(double r, double a) throws InterruptedException, IOException{
        double radio = 0, altura = 0;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        System.out.println("-Valores para calcular áreas de figuras-\n");
        try{
            System.out.printf("Ingresa un valor para radio: "); radio = lectura.nextDouble();
            System.out.printf("Ingresa un valor para altura: "); altura = lectura.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Error de formato.");
            lectura.nextLine();
            ValoresArea(radio, altura);
        }

        
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

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
