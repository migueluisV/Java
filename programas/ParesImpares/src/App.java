import java.util.InputMismatchException; //Excepción si hay un error de formato en tipos de datos.
import java.util.Scanner;

public class App {
    static Scanner lectura = new Scanner(System.in);
    
    public static void ParImpar(){
        int Num;

        try{
            System.out.println("Ingresa un número: "); Num = lectura.nextInt();
            lectura.close(); //Cierra el objeto Scanner.

            if ((Num % 2) == 0){ //Determina si el número ingresado es par o impar por medio del operador modulo.
                System.out.printf("%s es par.", Num);
            } else{
                System.out.printf("%s es impar.", Num);
            }
        } catch(InputMismatchException e){
            System.out.println("Error de formato.");
            lectura.nextLine(); //Limpia buffer de entrada de datos.
            ParImpar();
        }
    }

    public static void main(String[] args) throws Exception {
        ParImpar();
    }
}
