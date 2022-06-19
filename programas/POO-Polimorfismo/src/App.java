import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        String nombre;

        System.out.println("-Nombres para animales-\n");
        System.out.printf("Ingresa el nombre para un mamifero: "); nombre = lectura.nextLine();
        Mamifero m = new Mamifero(nombre);
        m.Desplazarse();
        System.out.println("\nPresiona ENTER para continuar...");
        System.in.read();

        lectura.nextLine();

        System.out.println("-Nombres para animales-\n");
        System.out.printf("Ingresa el nombre para un mamifero: "); nombre = lectura.nextLine();
        Ave a = new Ave(nombre);
        a.Desplazarse();
        System.out.println("\nPresiona ENTER para continuar...");
        System.in.read();

        lectura.nextLine();

        System.out.println("-Nombres para animales-\n");
        System.out.printf("Ingresa el nombre para un mamifero: "); nombre = lectura.nextLine();
        Pez p = new Pez(nombre);
        p.Desplazarse();
        System.out.println("\nPresiona ENTER para continuar...");
        System.in.read();

        lectura.nextLine();

        System.out.println("-Nombres para animales-\n");
        System.out.printf("Ingresa el nombre para un mamifero: "); nombre = lectura.nextLine();
        Reptil r = new Reptil(nombre);
        r.Desplazarse();

        lectura.close();
    }
}
