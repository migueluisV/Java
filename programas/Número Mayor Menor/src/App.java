import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    static Scanner lectura = new Scanner(System.in);

    public static void MayorMenor(float[] Nums, int cont, float NMayor, float NMenor){
        int i;

        if (cont == Nums.length){
            lectura.close();
            System.out.println("Los números digitados fueron:\n");
            for (i = 0; i < Nums.length; i++){
                System.out.printf("1- %s\n", Nums[i]);
            }

            System.out.printf("\nEl número mayor es: %s\n", NMayor);
            System.out.printf("El número menor es: %s\n", NMenor);
        } else{
            try{
                System.out.printf("%s. Digite un número: ", (cont + 1)); Nums[cont] = lectura.nextFloat();
    
                if (cont == 0){
                    NMayor = Nums[cont];
                    NMenor = Nums[cont];
                }
                if (Nums[cont] > NMayor) {NMayor = Nums[cont];}
                if (Nums[cont] < NMenor) {NMenor = Nums[cont];}
    
                cont++;
                MayorMenor(Nums, cont, NMayor, NMenor);
            } catch(InputMismatchException e){
                System.out.println("Error de formato");
                lectura.nextLine();
                MayorMenor(Nums, cont, NMayor, NMenor);
            }
        }        
    }

    public static void main(String[] args) throws Exception {
        float [] Nums;
        int cantNums;

        try{
            System.out.printf("¿Cuántos números va a ingresar?: "); cantNums = lectura.nextInt();
            Nums = new float[cantNums];

            MayorMenor(Nums, 0, 0, 0);
        } catch(InputMismatchException e){
            System.out.println("Error de formato");
        }
    }
}
