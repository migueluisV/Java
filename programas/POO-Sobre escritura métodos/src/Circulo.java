public class Circulo extends Areas{
    public Circulo(double radio){
        super(radio);
    }

    public double CalcularArea(){
        return Math.PI * Math.pow(super.Radio, 2);
    }

    public void ImprimirArea(){
        System.out.println("---Información del círculo---\n");
        System.out.println("El valor del radio es: " + super.Radio);
        System.out.println("El valor del área del círculo es: " + CalcularArea());
    }
}
