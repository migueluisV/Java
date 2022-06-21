import java.util.InputMismatchException; //Excepción si hay un error de formato en tipos de datos.
import java.util.Scanner;

public class App {
    static Scanner lectura = new Scanner(System.in);

    static void IngresoEdad(){
        int Edad, Meses, Dias;

        try{
            System.out.printf("Ingresa una edad: "); Edad = lectura.nextInt();
            lectura.close();
    
            Dias = Edad * 365;
            Meses = Edad * 12;
    
            System.out.println("Has vivido " + Edad + " años, o " + Meses + " meses, o " + Dias + " días.");
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