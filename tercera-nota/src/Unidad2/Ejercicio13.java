package Unidad2;

public class Ejercicio13 {

    class Jugador {

        int vida;

        public Jugador(int vidaInicial) {
            vida = vidaInicial;
        }

        public void curar() {
            vida = vida + 5;
        }

        public void curar(int cantidad) {
            vida = vida + cantidad;
        }

        public void curar(int cantidad, int vidaMaxima) {
            vida = vida + cantidad;

            if (vida > vidaMaxima) {
                vida = vidaMaxima;
            }
        }
    }

    public static void main(String[] args) {

        Ejercicio13 ejercicio = new Ejercicio13();
        Jugador steve = ejercicio.new Jugador(10);

        System.out.println("Vida inicial: " + steve.vida);

        steve.curar();
        System.out.println("Despues de curarse: " + steve.vida);

        steve.curar(8);
        System.out.println("Despues de usar una pocion: " + steve.vida);

        steve.curar(10, 20);
        System.out.println("Vida final: " + steve.vida);
    }
}