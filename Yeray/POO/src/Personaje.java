import javax.swing.*;
import java.lang.reflect.Array;

public class Personaje{

     String nombre;
     int x=0;
     int y=0;
     char orientacion= 'n';

    public Personaje(String nombre) {

        this.nombre = nombre;
        this.x = 0;
        this.y = 0;
        this.orientacion = 'n';

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(char orientacion) {
        this.orientacion = orientacion;
    }

    public void girar(){


        if(orientacion=='n'){
            setOrientacion('e');
        } else if (orientacion=='e') {
            setOrientacion('s');

        }
        else if (orientacion=='s') {
            setOrientacion('o');

        }else  {
            setOrientacion('n');

        }
    }

    public  void avanzar(){
        if(orientacion=='n'){
            setY(getY()+1);
        } else if (orientacion=='e') {
            setX(getX()+1);

        }
        else if (orientacion=='s') {
            setY(getY()-1);

        }else  {

            setX(getX()-1);
        }

    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", orientacion=" + orientacion +
                '}';
    }
}
