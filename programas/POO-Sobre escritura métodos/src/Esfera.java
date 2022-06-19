public class Esfera extends Areas {
    public Esfera(double radio){
        super(radio);
    }

    public double CalcularArea(){
        return 4 * Math.PI * Math.pow(super.Radio, 2);
    }

    public void ImprimirArea(){
        System.out.println("---Información de la esfera---\n");
        System.out.println("El valor del radio es: " + super.Radio);
        System.out.println("El valor del área de la esfera es: " + CalcularArea());
    }
}
