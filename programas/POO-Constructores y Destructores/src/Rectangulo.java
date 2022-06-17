public class Rectangulo extends Figuras{
    //Constructor.
    public Rectangulo(float base, float altura){
        super.Base = base;
        super.Altura = altura;
    }

    public float Area(){
        return super.a = (super.Base * super.Altura);
    }

    public float Perimetro(){
        return super.p = (super.Base + super.Altura) * 2;
    }

    public void Resultado(){
        System.out.println("---Datos del rectángulo---\n");
        System.out.println("Base del rectángulo: " + super.Base);
        System.out.println("Altura del rectángulo: " + super.Altura);
        System.out.println("Área del rectángulo: " + super.a + "u^2");
        System.out.println("Perimetro del rectángulo: " + super.p + "u");
    }

    //Destructor no necesario.
}
