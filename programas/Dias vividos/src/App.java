import java.util.InputMismatchException; //Excepción si hay un error de formato en tipos de datos.
import java.util.Scanner;

public class App {
    static Scanner lectura = new Scanner(System.in);

    static void IngresoEdad(){
        int Edad;

        try{
            System.out.printf("Registra una edad: "); Edad = lectura.nextInt();
            lectura.close();
            Edad *= 365;

            System.out.println("Has vivido " + Edad + " días");
        } catch (InputMismatchException e){
            System.out.println("Error de formato.");
            lectura.nextLine();
            IngresoEdad();
        }
    }

    public static void main(String[] args) throws Exception {
        IngresoEdad();
    }
}