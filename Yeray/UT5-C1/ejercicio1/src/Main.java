import java.security.Principal;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner t = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce tamaño de vector 1");
        int tam1 = t.nextInt();

        System.out.println("Introduce tamaño de vector 2");
        int tam2 = t.nextInt();

        Principal1 p = new Principal1(tam1,tam2) ;

        p.run();
    }
}