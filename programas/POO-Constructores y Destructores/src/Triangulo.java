public class Triangulo extends Figuras{
    //Constructor.
    public Triangulo(float base, float altura){
        super.Base = base;
        super.Altura = altura;
    }

    public float Area(){
        return super.a = (super.Base * super.Altura) / 2;
    }

    public float Perimetro(){
        if (super.Base != super.Altura){
            return super.p = (super.Altura * 2) + super.Base;
        }
        return super.p = super.Base * 3;
    }

    public void Resultado(){
        System.out.println("---Datos del triángulo---\n");
        System.out.println("Base del triángulo: " + super.Base);
        System.out.println("Altura del triángulo: " + super.Altura);
        System.out.println("Área del triángulo: " + super.a + "u^2");
        System.out.println("Perimetro del triángulo: " + super.p + "u");
    }

    //Destructor no necesario.
}