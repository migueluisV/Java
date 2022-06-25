import java.util.Stack; //Clase para trabajar con pilas dinámicas.

public class App {
    public static void main(String[] args) throws Exception {
        Stack<Double> Promedios = new Stack<Double>(); //Pila dinámica double para promedios
        Stack<String> Alumnos = new Stack<String>(); //Pila dinámica String para nombres de alumnos
        
        Pila_Alumnos pa = new Pila_Alumnos();
        pa.Menu(Promedios, Alumnos);
    }
}
