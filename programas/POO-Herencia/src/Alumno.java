public class Alumno extends Escuela{
    private String Nom, Carrera;
    private int NControl;
    private int Semestre;

    public Alumno(String nom, String carrera, int nc, int semestre, String uni, String dir, String tel){
        super(uni, dir, tel);
        Nom = nom;
        Carrera = carrera;
        NControl = nc;
        Semestre = semestre;
    }

    public void DesplegarAlumno(){
        super.DesplegarEscuela();
        System.out.println("\n---Datos del alumno---\n");
        System.out.println("Nombre del alumno: " + Nom);
        System.out.println("Carrera del alumno: " + Carrera);
        System.out.println("Número de control del alumno: " + NControl);
        System.out.println("Semestre que cursa el alumno: " + Semestre);
    }
}
