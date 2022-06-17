import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        float Base, Altura;

        System.out.println("-Datos del triángulo-\n");
        System.out.printf("Ingresa base del triángulo: "); Base = lectura.nextFloat();
        System.out.printf("Ingresa altura del triángulo: "); Altura = lectura.nextFloat();

        Triangulo t = new Triangulo(Base, Altura);
        t.Area(); t.Perimetro();
        t.Resultado();

        System.out.print("Presiona ENTER para continuar...");
        System.in.read();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        System.out.println("-Datos del recángulo-\n");
        System.out.printf("Ingresa base del recángulo: "); Base = lectura.nextFloat();
        System.out.printf("Ingresa altura del recángulo: "); Altura = lectura.nextFloat();
        lectura.close();

        Rectangulo r = new Rectangulo(Base, Altura);
        r.Area(); r.Perimetro();
        r.Resultado();
    }
}
