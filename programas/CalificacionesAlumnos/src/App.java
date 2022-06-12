public class App {
    public static void main(String[] args) throws Exception {
        float[] Calificaciones = new float[5];
        String[] Nombres = new String[5];
        CaliAl ca = new CaliAl();

        ca.IngresoDatos(Calificaciones, Nombres, 0);
    }
}
