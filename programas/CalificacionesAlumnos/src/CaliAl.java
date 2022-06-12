import java.util.Scanner;
import java.util.InputMismatchException;

public class CaliAl {
    //public float[] Calificaciones = new float[5];
    //public String[] Nombres = new String[5];
    public byte CalVali = 0, CalInvali = 0, CaliApro = 0, CaliRepro = 0;
    public float Prom, AcumCali = 0, CaliMax = 0, CaliMen;
    int i;
    Scanner lectura = new Scanner(System.in);

    public void IngresoDatos(float[] cal, String[] nom, int cont){
        for(i = cont; i < 5; i++){
            try{
                System.out.printf("%s. Ingresa una calificación: ", (i + 1)); cal[i] = lectura.nextFloat();
                System.out.printf("%s. Ingresa un nombre: ", (i + 1)); nom[i] = lectura.next();
            } catch(InputMismatchException e){
                System.out.println("Error de formato.");
                lectura.nextLine();
                IngresoDatos(cal, nom, i);
            }
            AcumCali += cal[i];
            if (cal[i] > 0.0 && cal[i] <= 10.0){
                CalVali++;
                if (cal[i] > 6.0 && cal[i] <= 10.0){
                    CaliApro++;
                } else if (cal[i] <= 6.0 && cal[i] > 0.0){
                    CaliRepro++;
                }
            } else{
                CalInvali++;
            }
        }
        Prom = AcumCali / 5;
        for (i = 0; i < 5; i++){
            if (cal[i] > CaliMax){
                CaliMax = cal[i];
            }
        }
        CaliMen = CaliMax;
        for (i = 0; i < 5; i++){
            if (cal[i] < CaliMen){
                CaliMen = cal[i];
            }
        }

        Despliegue(cal, nom);
    }

    public void Despliegue(float[] cal, String[] nom){

        System.out.println("Los alumnos ingresados son:\n");
        for(i = 0; i < 5; i++){
            System.out.printf("%s - %s, con calificación de %s.\n", (i + 1), nom[i], cal[i]);
        }

        System.out.printf("Hubo un total de %s calificaciones válidas y %s inválidas.\n", CalVali, CalInvali);
        System.out.printf("Hubo un total de %s calificaciones aprobatorias y %s reprobatorias.\n", CaliApro, CaliRepro);
        System.out.printf("La calificación mayor fue de %s y la menor es de %s.\n", CaliMax, CaliMen);
        System.out.printf("El promedio de todas las calificaciones es de %s.", Prom);
    }
}
