import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void ParImpar(){
        int Num;
        Scanner lectura = new Scanner(System.in);

        try{
            System.out.println("Ingresa un número: ");
            Num = lectura.nextInt();
            lectura.close();

            if ((Num % 2) == 0){
                System.out.printf("%s es par.", Num);
            } else{
                System.out.printf("%s es impar.", Num);
            }
        } catch(InputMismatchException e){
            System.out.println("Error de formato.");
            ParImpar();
        }
    }

    public static void main(String[] args) throws Exception {
        ParImpar();
    }
}
