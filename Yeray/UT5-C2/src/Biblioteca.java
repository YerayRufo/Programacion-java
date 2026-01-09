

public class Biblioteca {
    private String nombre;
    private int numeroLibros;
    private int maximoLibros;
    private Libro[] libros;

    public Biblioteca(String nombre, int maximoLibros) {
        this.nombre = nombre;
        this.maximoLibros = maximoLibros;
        this.libros = new Libro[maximoLibros];
        this.numeroLibros = 0;
    }


    public void annadirLibro(String titulo, String nombre, String apellido1, String apellido2, Genero genero) {
        /*comprobar si existe*/
        for (int i = 0; i < numeroLibros; i++) {
            if (libros[i].getTitulo().equals(titulo) &&
                    libros[i].getAutor().equals(apellido1 + " " + apellido2 + ", " + nombre)&& libros[i].getGenero().equals(genero)) {
                libros[i].setEjemplares(libros[i].getEjemplares() + 1);
                return;
            }
        }
        /* si hay hueco*/
        if (numeroLibros < maximoLibros) {
            libros[numeroLibros] = new Libro(titulo, nombre, apellido1, apellido2,genero);
            numeroLibros++;

        } else {
            /*si no hay hueco*/
            System.out.println("La biblioteca está llena");
        }
    }

    public String devolverTitulos(String busqueda){
        String titulos="";
        for (int i = 0; i < numeroLibros; i++) {

            if (libros[i].getTitulo().toLowerCase().indexOf(busqueda.toLowerCase())!=-1){
                titulos+="\nTitulo: "+ libros[i].getTitulo()+"\nAutor: "+libros[i].getAutor()+"\nGenero: "+ libros[i].getGenero();
            }
        }

        return titulos;
    }


}
