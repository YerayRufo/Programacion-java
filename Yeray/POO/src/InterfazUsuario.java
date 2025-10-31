import java.util.Scanner;
public class InterfazUsuario {
Scanner t = new Scanner(System.in);

    public void establecerMenu(){
        System.out.println("1. Avanzar personaje");
        System.out.println("2. Girar personaje 90º a la derecha");
        System.out.println("3. Mostrar situacion");
        System.out.println("4. Salir");
    }
    public  int introducirOpcion(){
        int eleccion = t.nextInt();
        return eleccion;
    }
    public  String teclearNombre(){
        String name = t.next();
        return name;
    }
    public  void ejecutar(){
      Personaje personaje;
      String nombre = teclearNombre();
      personaje = new Personaje(nombre);
      int opcion = 0;
      do{
          establecerMenu();
          opcion=introducirOpcion();
          switch (opcion){
              case 1:
                  personaje.avanzar();
                  break;
              case 2:
                  personaje.girar();
                  break;
              case 3:
                  personaje.toString();
                  break;
              case 4:

          }
      }while (opcion!=4);


    }

}
