public class Pez extends Animal {
    private String Nombre;

    public Pez(String nombre){
        Nombre = nombre;
    }

    public void Desplazarse(){
        System.out.printf("Hola, mi nombre es %s y me desplazo Nadando.", Nombre);
    }
}
