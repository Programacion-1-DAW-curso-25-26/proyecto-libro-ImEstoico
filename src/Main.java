import Model.LibroClase;
import Model.Personaje;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Personaje hero = new Personaje("rocky");

        hero.saludar();

        Personaje villano = new Personaje("Orco Feo");

        Personaje villano2 = new Personaje("zombie palurdo",10,10 );
        villano.saludar();
        villano2.saludar();

//        for (int i = 0; i < 50; i++) {
//            villano.subirNivel();
//            villano.saludar();
//        }



        System.out.println("--------------------");
        System.out.println("-------LIBROS-------");
        System.out.println("--------------------");

        LibroClase librito = new LibroClase("Quijote", "miguel C.", 5,1013);

        System.out.println(librito.toString());
    }
}