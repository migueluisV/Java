import java.io.IOException; //Excepción si hay error durante entrada y salida de datos.
import java.util.InputMismatchException; //Excepción si hay un error de formato en tipos de datos.
import java.util.Scanner;

public class App {
    static Scanner lectura = new Scanner(System.in);

    static void ValoresPerimetro() throws InterruptedException, IOException{
        float l, altura, Base, l1, l2, l3;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia consola/terminal/pantalla.

        System.out.println("-Ingresa valores-\n");
        try{
            System.out.print("Ingrese un valor para calcular el perímetro de un triángulo equilátero: "); l = lectura.nextFloat();
            lectura.nextLine();
            System.out.print("Ingrese un valor para de base calcular el perímetro de un triángulo isóseles: "); Base = lectura.nextFloat();
            lectura.nextLine();
            System.out.print("Ingrese un valor para de altura calcular el perímetro de un triángulo isóseles: "); altura = lectura.nextFloat();
            lectura.nextLine();
            System.out.print("Ingrese un valor para calcular el perímetro de un triángulo escaleno: "); l1 = lectura.nextFloat();
            lectura.nextLine();
            System.out.print("Ingrese un valor para calcular el perímetro de un triángulo escaleno: "); l2 = lectura.nextFloat();
            lectura.nextLine();
            System.out.print("Ingrese un valor para calcular el perímetro de un triángulo escaleno: "); l3 = lectura.nextFloat();
            lectura.nextLine();
            lectura.close();//Cierra el objeto Scanner.

            Triangulo tri = new Triangulo();
            tri.Perimetro(l);
            tri.Perimetro(altura, Base);
            tri.Perimetro(l1, l2, l3);
            tri.Resultados();
        } catch(InputMismatchException e){
            System.out.println("Error de formato.");
            lectura.nextLine(); //Limpia buffer de entrada de datos.
            ValoresPerimetro();
        }
    }

    public static void main(String[] args) throws Exception {
        ValoresPerimetro();
    }
}
