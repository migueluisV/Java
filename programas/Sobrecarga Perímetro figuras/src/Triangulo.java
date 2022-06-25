public class Triangulo {
    private float perimetro1, perimetro2, perimetro3;

    public float Perimetro(float lado){
        return perimetro1 = lado * 3;
    }

    public float Perimetro(float altura, float Base){
        return perimetro2 = (altura + Base) * 2;
    }

    public float Perimetro(float lado1, float lado2, float lado3){
        return perimetro3 = lado1 + lado2 + lado3;
    }

    public void Resultados(){
        System.out.println("\n---Resultados---\n");
        System.out.println("Perímetro del triángulo equilatero: " + perimetro1 + "u.");
        System.out.println("Perímetro del triángulo isóseles: " + perimetro2 + "u.");
        System.out.println("Perímetro del triángulo escaleno: " + perimetro3 + "u.");
    }
}
