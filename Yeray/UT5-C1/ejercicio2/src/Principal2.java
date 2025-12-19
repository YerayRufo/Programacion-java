import java.util.Arrays;

public class Principal2 {
    int numero = 0;
    int[] v = new int[4];

    public boolean introducirNumero() {
        System.out.println("introduce un numero de 4 cifras");
        numero = Main.t.nextInt();
        if (numero > 999 && numero < 10000) {
            return true;
        } else {
            return false;
        }
       // return true;
    }

    public void crearArray() {
        if (!introducirNumero()) {
            System.out.println("numero requerido -> 4 cifras");
        } else {

            for (int i = v.length - 1; i >= 0; i--) {
                v[i] = numero % 10;
                numero = numero / 10;

            }System.out.println("extrayendo cifras");
        }
    }


    public String visualizar() {
        return  "numero=" + numero +
                ", v=" + Arrays.toString(v);
    }
    public  void run(){

        crearArray();
        System.out.println(visualizar());
    }
}
