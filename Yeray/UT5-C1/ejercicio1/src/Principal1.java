
import java.util.Arrays;

public class Principal1 {

    private int[] v1;
    private int[] v2;
    private int[] vFusion;

    public Principal1(int tam1, int tam2) {
        v1 = new int[tam1];
        v2 = new int[tam2];
        vFusion = new int[v1.length + v2.length];
    }

    public void cargarVector() {
        System.out.println("Vector 1:");
        for (int i = 0; i < v1.length; i++) {
            System.out.println("Añade el valor del vector en la posicion "+ (i+1)+": ");
            int valor = Main.t.nextInt();
            v1[i] = valor;
        }
        System.out.println("Vector 2:");
        for (int i = 0; i < v2.length; i++) {
            System.out.println("Añade el valor del vector en la posicion "+ (i+1)+": ");
            int valor = Main.t.nextInt();
            v2[i] = valor;
        }
    }

    public void fusionarVectores() {

        int valor = 0;
        for (int elemento : v1) {
            vFusion[valor] = elemento;
            valor++;
        }
        for (int elemento2 : v2) {
            vFusion[valor] = elemento2;
            valor++;
        }


    }



    public String visualizarVectores() {
        return "Vectores creados" +
                "v1=" + Arrays.toString(v1) +
                ", v2=" + Arrays.toString(v2) +
                ", vFusion = "+ Arrays.toString(vFusion);
    }
    public void run(){
        cargarVector();
        fusionarVectores();
        System.out.println(visualizarVectores());

    }
}
