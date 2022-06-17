import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

public class Figuras {
    private Scanner lec = new Scanner(System.in);

    public void DibujarTriangulo() throws IOException{
        byte Altura, R, C, B;

        try{
            System.out.printf("Altura del triángulo (número entero): "); Altura = lec.nextByte();

            System.out.println("Triángulo:\n");
            for (R = 1; R <= Altura; R++) {
                for (B = 1; B <= (Altura - R); B++) {
                    System.out.printf(" ");
                }
    
                for (C = 1; C <= (R * 2) - 1; C++) {
                    System.out.printf("*");
                }
                System.out.printf("\n");
            }
            System.out.printf("Presiona cualquier tecla para ir al menú.");
            System.in.read();
            
        } catch(InputMismatchException e){
            System.out.print("Error de formato.\n");
            lec.nextLine();
            DibujarTriangulo();
        }
    }

    public void DibujarRectangulo() throws IOException{
        byte Base, Altura, R, C;

        try{
            System.out.printf("Base del rectángulo (número entero): "); Base = lec.nextByte();
            System.out.printf("Altura del rectángulo (número entero): "); Altura = lec.nextByte();
            
            System.out.println("Rectángulo:\n");
            for (R = 1; R <= Altura; R++) {
                for (C = 1; C <= Base; C++){
                    System.out.print("*  ");
                }
                System.out.printf("\n");
            }
            System.out.printf("Presiona cualquier tecla para ir al menú.");
            System.in.read();
            
        } catch(InputMismatchException e){
            System.out.print("Error de formato.\n");
            lec.nextLine();
            DibujarTriangulo();
        }
    }

    public void DibujarCuadrado() throws IOException{
        byte Lado, R, C;

        try{
            System.out.printf("Lado del cuadrado (número entero): "); Lado = lec.nextByte();
            
            System.out.println("Cuadrado:\n");
            for (R = 1; R <= Lado; R++) {
                for (C = 1; C <= Lado; C++){
                    System.out.print("* ");
                }
                System.out.printf("\n");
            }
            System.out.printf("Presiona cualquier tecla para ir al menú.");
            System.in.read();
            
        } catch(InputMismatchException e){
            System.out.print("Error de formato.\n");
            lec.nextLine();
            DibujarTriangulo();
        }
    }
}
