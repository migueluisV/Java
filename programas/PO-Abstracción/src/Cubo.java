public class Cubo extends Figuras {
    private double Lado;

    public Cubo(double lado){
        this.Lado = lado;
    }

    public double CalcularVolumen(){
        return Math.pow(Lado, 3);
    }

    public void DesplegarVolumen(){
        System.out.println("\n---Datos del cubo---\n");
        System.out.println("La medida del lado del cubo es:" + Lado + "u.");
        System.out.println("El volumen del cubo es: " + CalcularVolumen() + "u^3.");
    }
}