public class Cilindro extends Areas {
    protected double Altura;

    public Cilindro(double radio, double altura){
        super(radio);
        Altura = altura;
    }

    public double CalcularArea(){
        return 2 * Math.PI * super.Radio * (Altura + super.Radio);
    }

    public void ImprimirArea(){
        System.out.println("---Información del cilindro---\n");
        System.out.println("El valor del radio es: " + super.Radio);
        System.out.println("El valor del área de la cilindro es: " + CalcularArea());
    }
}