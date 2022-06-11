import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int Edad, Meses, Dias;
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Ingresa una edad: ");
        Edad = lectura.nextInt();
        lectura.close();

        Dias = Edad * 365;
        Meses = Edad * 12;

        System.out.println("Has vivido " + Edad + " años, " + Meses + " meses, y " + Dias + " días.");
    }
}