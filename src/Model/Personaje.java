package Model;

public class Personaje {


    private String nombre;
    private int vida;
    private int nivel;

    public Personaje(String nombre, int vida, int nivel) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
    }

    public Personaje(String nombre) {
        this.nombre = nombre;
        vida = 100;
        nivel = 1;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida >= 0 && vida <= 100) {
            this.vida = vida;
        }else {
            System.out.println("la vida no puede ser mayor que 100 ni menor que 0");
        }    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel >= 0 && nivel <= 50) {
            this.nivel = nivel;
        }else {
            System.out.println("El nivel no puede ser mayor que 50");
        }
    }



    public void saludar() {

        System.out.println("me llamo " + nombre);
        System.out.println("tengo " + vida + " vida");
        System.out.println("mi nivel es " + nivel);
    }


    void subirNivel() {
        vida = 100;
        nivel += 1 ;
    }

    void recibirDano(int puntos){
        vida = vida - puntos;

        if(esGolpeCritico()){
            System.out.println("golpe critico");
            puntos = 2 * puntos;
        }


        if (vida <= 0) {
            vida = 0;
            System.out.println("[MORIDO] " + nombre +" Ha sido derrotado");
        } else {
            System.out.println("[DAÑO] " + nombre + " ha recibido " + puntos + " de daño. Vida restante: " + vida);
        }

    }

    private boolean esGolpeCritico(){

        return Math.random() < 0.9;

    }

    void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }
}


