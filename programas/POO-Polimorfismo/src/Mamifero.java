public class Mamifero extends Animal {
    private String Nombre;

    public Mamifero(String nombre){
        Nombre = nombre;
    }

    public void Desplazarse(){
        System.out.printf("Hola, mi nombre es %s y me desplazo Caminando.", Nombre);
    }
}
