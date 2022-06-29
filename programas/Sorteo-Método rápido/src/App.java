import java.io.IOException; //Excepción si hay error durante entrada y salida de datos.
import java.util.InputMismatchException; //Excepción si hay un error de formato en tipos de datos.
import java.util.Random; //Clase para trabajar con un generador de números aleatorios. 
import java.util.Scanner;

public class App {
    private static int[]Numeros;
    public static Scanner lectura = new Scanner(System.in);

    private static void ValoresArreglo() throws InterruptedException, IOException{
        Random aleatorio = new Random(); //Declara un objeto Random para generar números aleatorios.
        int Tam, LimI, LimS, i;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        System.out.println("-Valores para generar un arreglo-\n");
        try{
            System.out.print("¿De que tamaño quiere el arreglo? (número entero): "); Tam = lectura.nextInt();
            lectura.nextLine(); //Limpia buffer de entrada de datos.
            System.out.print("Ingresa el límite inferior de valores a ingresar en el arreglo (número entero): "); LimI = lectura.nextInt();
            lectura.nextLine(); //Limpia buffer de entrada de datos.
            System.out.print("Ingresa el límite superior de valores a ingresar en el arreglo (número entero): "); LimS = lectura.nextInt();
            lectura.nextLine(); //Limpia buffer de entrada de datos.
            Numeros = new int[Tam];

            lectura.close(); //Cierra el objeto Scanner.

            for (i = 0; i < Numeros.length; i++){
                Numeros[i] = aleatorio.nextInt(LimS - LimI + 1) + LimI; //Asigna un valor entero generado entre un rango al arreglo.
            }
        } catch(InputMismatchException e){
            System.out.println("Error de formato.");
            lectura.nextLine(); //Limpia buffer de entrada de datos.
            ValoresArreglo();
        }
    }

    private static void SorteoRapido(int[] Nums, int p, int u){
        //Declaración e incialización de variables.
        int i = p, j = u, central = (p + u) / 2, aux, pivote = Nums[central];

        //Ordenamiento rápido.
        do{
            while (Nums[i] < pivote) {i++;}
            while (Nums[j] > pivote) {j--;}
            if (i <= j){
                aux = Nums[i];
                Nums[i] = Nums[j];
                Nums[j] = aux;
                i++;
                j--;
            }
        } while(i <= j);

        //Condición de salida para procedimiento recursivo.
        if (p < j)
            SorteoRapido(Nums, p, j);
        if (i < u)
            SorteoRapido(Nums, i, u);
    }

    public static void main(String[] args) throws Exception {
        int i;

        //Establece parámetros para declarar un arreglo y rango de números enteros que estarán dentro de este arreglo.
        ValoresArreglo();

        //Despliegue de resultados.
        System.out.println("-Números enteros generados aleatoriamente-\n");
        for (i = 0; i < Numeros.length; i++){
            System.out.printf("%s - %s\n", i + 1, Numeros[i]);
        }

        //Ordena los números.
        SorteoRapido(Numeros, 0, Numeros.length - 1);

        //Despliegue de resultados.
        System.out.println("-\nNúmeros enteros generados aleatoriamente ordenados-\n");
        for (i = 0; i < Numeros.length; i++){
            System.out.printf("%s - %s\n", i + 1, Numeros[i]);
        }
    }
}
