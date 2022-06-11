import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int Edad;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Registra una edad: ");
        Edad = lectura.nextInt();
        lectura.close();
        Edad *= 365;
        System.out.println("Has vivido " + Edad + " días");
    }
}