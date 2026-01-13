package Model;

public class LibroClase {

    private String nombre;
    private String autor;
    private int valoracion;
    private int numeroPaginas;


    public LibroClase(String nombre, String autor, int valoracion, int numeroPaginas) {
        this.nombre = nombre;
        this.autor = autor;
        setValoracion(valoracion);
        this.numeroPaginas = numeroPaginas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        if (valoracion >= 0 && valoracion <= 10) {
            this.valoracion = valoracion;
        } else {
            System.out.println("La valoración debe estar entre 0 y 10");
        }
    }


    @Override
    public String toString() {
        return "LibroClase{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", valoracion=" + valoracion +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
