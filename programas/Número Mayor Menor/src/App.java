import java.util.Scanner;
import java.util.InputMismatchException; //Excepción si hay un error de formato en tipos de datos.

public class App {
    static Scanner lectura = new Scanner(System.in);

    public static void MayorMenor(float[] Nums, int cont, float NMayor, float NMenor){
        int i;

        if (cont == Nums.length){ //Condición para salir del método recursivo.
            lectura.close(); //Cierra el objeto Scanner.
            System.out.println("Los números digitados fueron:\n");
            for (i = 0; i < Nums.length; i++){
                System.out.printf("1- %s\n", Nums[i]);
            }

            System.out.printf("\nEl número mayor es: %s\n", NMayor);
            System.out.printf("El número menor es: %s\n", NMenor);
        } else{
            try{
                System.out.printf("%s. Digite un número: ", (cont + 1)); Nums[cont] = lectura.nextFloat();
    
                if (cont == 0){ //Inicializa valor mayor y menor.
                    NMayor = Nums[cont];
                    NMenor = Nums[cont];
                }
                if (Nums[cont] > NMayor) {NMayor = Nums[cont];} //Va actualizando cual es el número mayor y menor.
                if (Nums[cont] < NMenor) {NMenor = Nums[cont];}
    
                cont++; //Incrementa contador.
                MayorMenor(Nums, cont, NMayor, NMenor); //Llamada recursiva
            } catch(InputMismatchException e){
                System.out.println("Error de formato");
                lectura.nextLine(); //Limpia buffer de entrada de datos.
                MayorMenor(Nums, cont, NMayor, NMenor);
            }
        }        
    }

    public static void main(String[] args) throws Exception {
        float [] Nums; //Declara arreglo de números.
        int cantNums;

        try{
            System.out.printf("¿Cuántos números va a ingresar?: "); cantNums = lectura.nextInt();
            Nums = new float[cantNums]; //Inicializa el arreglo de números.

            MayorMenor(Nums, 0, 0, 0);
        } catch(InputMismatchException e){
            System.out.println("Error de formato");
        }
    }
}
