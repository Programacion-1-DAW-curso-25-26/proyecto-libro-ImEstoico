import Model.LibroClase;

public class MainLibro {
    public static void main(String[] args) {

        System.out.println("--------------------");
        System.out.println("-------LIBROS-------");
        System.out.println("--------------------");

        LibroClase librito = new LibroClase("Quijote", "miguel C.", 5,1013);

        System.out.println(librito.toString());
    }
}