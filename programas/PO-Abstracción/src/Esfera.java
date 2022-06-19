public class Esfera extends Figuras {
    private double Radio;

    public Esfera(double radio){
        this.Radio = radio;
    }

    public double CalcularVolumen(){
        return (4 * Math.PI * Math.pow(Radio, 3)) / 3;
    }

    public void DesplegarVolumen(){
        System.out.println("\n---Datos de la esfera---\n");
        System.out.println("La medida del radio de la esfera es:" + Radio + "u.");
        System.out.println("El volumen de la esfera es: " + CalcularVolumen() + "u^3.");
    }
}