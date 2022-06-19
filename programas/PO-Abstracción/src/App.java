import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

public class App {
    private static Scanner lectura = new Scanner(System.in);

    static void ValoresVolumen(double r, double a, double l) throws InterruptedException, IOException {
        double radio = 0, altura = 0, lado = 0;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        System.out.println("-Valores para calcular volumen de figuras-\n");
        try{
            System.out.printf("Ingresa un valor para radio: "); radio = lectura.nextDouble();
            System.out.printf("Ingresa un valor para altura: "); altura = lectura.nextDouble();
            System.out.printf("Ingresa un valor para un lado: "); lado = lectura.nextDouble();

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            Cono cono = new Cono(radio, altura);
            cono.DesplegarVolumen();

                Esfera esfera = new Esfera(radio);
            esfera.DesplegarVolumen();

            Cilindro cilindro = new Cilindro(radio, altura);
            cilindro.DesplegarVolumen();

            Cubo cubo = new Cubo(lado);
            cubo.DesplegarVolumen();
        } catch (InputMismatchException e){
            System.out.println("Error de formato.");
            lectura.nextLine();
            ValoresVolumen(radio, altura, lado);
        }
    }
    public static void main(String[] args) throws Exception {
        ValoresVolumen(0, 0, 0);
    }
}