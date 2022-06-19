public class Reptil extends Animal {
    private String Nombre;

    public Reptil(String nombre){
        Nombre = nombre;
    }

    public void Desplazarse(){
        System.out.printf("Hola, mi nombre es %s y me desplazo Arrastrandome.", Nombre);
    }
}