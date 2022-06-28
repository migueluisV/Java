import java.util.Queue; //Clase para trabajar con colas dinámicas.
import java.util.LinkedList; //Clase para trabajar con listas, necesario por las colas dinámicas.

public class App {
    public static void main(String[] args) throws Exception {
        Queue<String> Nombres = new LinkedList<>();
        
        Cola_Nombres cn = new Cola_Nombres();
        cn.Menu(Nombres);
    }
}
