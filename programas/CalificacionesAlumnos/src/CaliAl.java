import java.util.Scanner;
import java.util.InputMismatchException;

public class CaliAl {
    public byte CalVali = 0, CalInvali = 0, CaliApro = 0, CaliRepro = 0;
    public float Prom, AcumCali = 0, CaliMax = 0, CaliMen;
    Scanner lectura = new Scanner(System.in);

    public void IngresoDatos(float[] cal, String[] nom, int cont){
        int i;
        if (cont == 5){
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

            lectura.close();
            Despliegue(cal, nom);
        } else{
            try{
                System.out.printf("%s. Ingresa una calificación: ", (cont + 1)); cal[cont] = lectura.nextFloat();
                lectura.nextLine();
                System.out.printf("%s. Ingresa un nombre: ", (cont + 1)); nom[cont] = lectura.nextLine();

                AcumCali += cal[cont];
                if (cal[cont] > 0.0 && cal[cont] <= 10.0){
                    CalVali++;
                    if (cal[cont] > 6.0 && cal[cont] <= 10.0){
                        CaliApro++;
                    } else if (cal[cont] <= 6.0 && cal[cont] > 0.0){
                        CaliRepro++;
                    }  
                } else{
                    CalInvali++;
                }

                cont++;
                IngresoDatos(cal, nom, cont);
            } catch(InputMismatchException e){
                System.out.println("Error de formato.");
                lectura.nextLine();
                IngresoDatos(cal, nom, cont);
            }
        }
    }

    public void Despliegue(float[] cal, String[] nom){
        int i;
        System.out.println("\nLos alumnos ingresados son:\n");
        for(i = 0; i < 5; i++){
            System.out.printf("%s - %s, con calificación de %s.\n", (i + 1), nom[i], cal[i]);
        }

        System.out.printf("Hubo un total de %s calificaciones válidas y %s inválidas.\n", CalVali, CalInvali);
        System.out.printf("Hubo un total de %s calificaciones aprobatorias y %s reprobatorias.\n", CaliApro, CaliRepro);
        System.out.printf("La calificación mayor fue de %s y la menor es de %s.\n", CaliMax, CaliMen);
        System.out.printf("El promedio de todas las calificaciones es de %s.", Prom);
    }
}
