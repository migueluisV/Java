import java.io.IOException; //Excepción si hay error durante entrada y salida de datos.
import java.util.InputMismatchException; //Excepción si hay un error de formato en tipos de datos.
import java.util.Scanner;

public class Figuras {
    private Scanner lec = new Scanner(System.in);

    public void DibujarTriangulo() throws IOException{
        byte Altura, R, C, B;

        try{
            System.out.printf("Altura del triángulo (número entero): "); Altura = lec.nextByte();

            System.out.println("Triángulo:\n"); //Bucles que imprimen un triángulo con una altura asignada por el usuario.
            for (R = 1; R <= Altura; R++) { //Bucle para la altura.
                for (B = 1; B <= (Altura - R); B++) { //Bucle para los espacios en blanco.
                    System.out.printf(" ");
                }
    
                for (C = 1; C <= (R * 2) - 1; C++) { //Bucle para los asteriscos que conforman al triángulo.
                    System.out.printf("*");
                }
                System.out.printf("\n");
            }
            System.out.printf("Presiona cualquier tecla para ir al menú.");
            System.in.read(); //Espera a que se presione ENTER para continuar
            
        } catch(InputMismatchException e){
            System.out.print("Error de formato.\n");
            lec.nextLine(); //Limpia buffer de entrada de datos.
            DibujarTriangulo();
        }
    }

    public void DibujarRectangulo() throws IOException{
        byte Base, Altura, R, C;

        try{
            System.out.printf("Base del rectángulo (número entero): "); Base = lec.nextByte();
            System.out.printf("Altura del rectángulo (número entero): "); Altura = lec.nextByte();
            
            System.out.println("Rectángulo:\n"); //Bucles que imprimen un rectángulo con una altura asignada por el usuario.
            for (R = 1; R <= Altura; R++) { //Bucle para la altura
                for (C = 1; C <= Base; C++){ //Bucle para la anchura
                    System.out.print("*  ");
                }
                System.out.printf("\n");
            }
            System.out.printf("Presiona cualquier tecla para ir al menú.");
            System.in.read();
            
        } catch(InputMismatchException e){
            System.out.print("Error de formato.\n");
            lec.nextLine(); //Limpia buffer de entrada de datos.
            DibujarTriangulo();
        }
    }

    public void DibujarCuadrado() throws IOException{
        byte Lado, R, C;

        try{
            System.out.printf("Lado del cuadrado (número entero): "); Lado = lec.nextByte();
            
            System.out.println("Cuadrado:\n"); //Bucles que imprimen un cuadrado con una altura asignada por el usuario.
            for (R = 1; R <= Lado; R++) { //Bucle para la un lado
                for (C = 1; C <= Lado; C++){ //Bucle para un lado
                    System.out.print("* ");
                }
                System.out.printf("\n");
            }
            System.out.printf("Presiona cualquier tecla para ir al menú.");
            System.in.read();
            
        } catch(InputMismatchException e){
            System.out.print("Error de formato.\n");
            lec.nextLine(); //Limpia buffer de entrada de datos.
            DibujarTriangulo();
        }
    }
}
