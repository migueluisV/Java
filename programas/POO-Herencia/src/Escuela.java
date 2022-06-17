public class Escuela {
    private String Uni, Dir, Tel;

    public Escuela(String uni, String dir, String tel){
        Uni = uni;
        Dir = dir;
        Tel = tel;
    }

    public void DesplegarEscuela(){
        System.out.println("---Datos de la escuela---\n");
        System.out.println("La universidad es: " + Uni);
        System.out.println("La dirección de la universidad es: " + Dir);
        System.out.println("El teléfono de la universidad es: " + Tel);
    }
}