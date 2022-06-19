public class Ave extends Animal {
    private String Nombre;

    public Ave(String nombre){
        Nombre = nombre;
    }

    public void Desplazarse(){
        System.out.printf("Hola, mi nombre es %s y me desplazo Volando.", Nombre);
    }
}
