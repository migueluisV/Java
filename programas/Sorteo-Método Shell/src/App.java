import java.io.IOException; //Excepción si hay error durante entrada y salida de datos.
import java.util.InputMismatchException; //Excepción si hay un error de formato en tipos de datos.
import java.util.Scanner;

public class App {
    public static Scanner lectura = new Scanner(System.in);

    private static void IngresoSueldos(float[] Sueldos, int pos) throws InterruptedException, IOException{
        //Declaración e inicialización de variables.
        int salto = Sueldos.length / 2, cont, i;
        float aux;
        boolean bandera;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        try{
            System.out.println("-Ordenamiento Shell-\n");
            System.out.println("Ingresa 10 salarios:");
            while (pos < Sueldos.length){
                System.out.printf("%s- ", pos + 1); Sueldos[pos] = lectura.nextFloat();
                pos++;
            }

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

            //Ordenamiento Shell ascendente.
            while (salto > 0){
                bandera = false;
                cont = 1;
                while (Sueldos[cont - 1] > Sueldos[(cont - 1) + salto]){
                    aux = Sueldos[(cont - 1) + salto];
                    Sueldos[(cont - 1) + salto] = Sueldos[cont - 1];
                    Sueldos[cont - 1] = aux;
                    bandera = true;
                }
                salto /= 2;
            }

            //Despliegue de resultados.
            System.out.println("---Sueldos ordenados por el método Shell---\n");
            for (i = 0; i < Sueldos.length; i++){
                System.out.printf("%s - %s\n", i + 1, Sueldos[i]);
            }
        } catch(InputMismatchException e){
            System.out.println("Error de formato.");
            lectura.nextLine(); //Limpia buffer de entrada de datos.
            IngresoSueldos(Sueldos, pos);
        }
    }

    public static void main(String[] args) throws Exception {
        float[] Sueldos = new float[10];
        IngresoSueldos(Sueldos, 0);
    }
}
