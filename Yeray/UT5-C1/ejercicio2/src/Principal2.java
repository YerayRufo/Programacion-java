import java.util.Arrays;

public class Principal2 {
    int numero = 0;
    int[] v = new int[4];

    public boolean introducirNumero() {
        numero = Main.t.nextInt();
        if (numero < 10000 && numero > 999) {
            return true;
        } else {
            return false;
        }
    }

    public void crearArray() {
        if (!introducirNumero()) {
            System.out.println("numero requerido -> 4 cifras");
        } else {
            for (int i = v.length - 1; i >= 0; i--) {
                v[i] = numero % 10;
                numero = numero / 10;
            }
        }
    }


    public String visualizar() {
        return  "numero=" + numero +
                ", v=" + Arrays.toString(v);
    }
    public static void run(){
        introducirNumero();
        crearArray();
        System.out.println(visualizar());
    }
}
