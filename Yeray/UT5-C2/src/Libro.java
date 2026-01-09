public class Libro {
    private String titulo;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int ejemplares;
    private Genero genero;
private String autor;

    public Libro(String titulo, String nombre, String apellido1,String apellido2,Genero genero) {
        this.titulo = titulo;
        this.autor=obtenerAutor(nombre,apellido1,apellido2);
        this.ejemplares = 1;
        this.genero = genero;
    }



    private String obtenerAutor(String nombre, String apellido1, String apellido2){
        return (apellido1+" "+apellido2 +","+ nombre);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
