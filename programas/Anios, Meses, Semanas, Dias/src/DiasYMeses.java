import java.util.Scanner;

public class DiasYMeses {
    private int Anios, Dias, Semanas, Meses;
    Scanner lectura = new Scanner(System.in);

    public void Iniciar(){
        System.out.println("Ingresa un número entero para trabajarlo como días: ");
        Dias = lectura.nextInt();
        lectura.close();

        Calculo();
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
