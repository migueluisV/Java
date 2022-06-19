public class Cilindro extends Figuras {
    private double Radio, Altura;

    public Cilindro(double radio, double altura){
        this.Radio = radio;
        this.Altura = altura;
    }

    public double CalcularVolumen(){
        return Math.PI * Math.pow(Radio, 2) * Altura;
    }

    public void DesplegarVolumen(){
        System.out.println("\n---Datos del cilindro---\n");
        System.out.println("La medida del radio del cilindro es:" + Radio + "u.");
        System.out.println("La medida de la altura del cilindro es: " + Altura + "u.");
        System.out.println("El volumen del cilindro es: " + CalcularVolumen() + "u^3.");
    }
}