import java.io.IOException; //Excepción si hay error durante entrada y salida de datos.
import java.util.InputMismatchException; //Excepción si hay un error de formato en tipos de datos.
import java.util.Scanner;

public class DiasYMeses {
    private int Anios, Dias, Semanas, Meses;
    Scanner lectura = new Scanner(System.in);

    public void Iniciar() throws InterruptedException, IOException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.
        
        try{
            System.out.printf("Ingresa un número entero para trabajarlo como días: "); Dias = lectura.nextInt();
    
            Calculo();
        } catch (InputMismatchException e){
            System.out.println("Error de formato.");
            lectura.nextLine(); //Limpia buffer de entrada de datos.
            Iniciar();
        }
    }

    private void Calculo(){
        Anios = Dias / 365;
        Meses = Dias / 30;
        Semanas = (Dias % 30) / 7;
    }

    public void Despliegue(){
        System.out.printf("%s días son: %s años, %s meses, %s semanas y %s días.", Dias, Anios, Meses, Semanas, (Dias % 30) % 7);
    }
}
