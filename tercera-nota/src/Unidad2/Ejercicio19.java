package Unidad2;

import java.util.Scanner;

public class Ejercicio19 {

    class Personaje {

        int vida;
        int armadura;

        public Personaje(int vidaInicial, int armaduraInicial) {
            vida = vidaInicial;
            armadura = armaduraInicial;
        }

        public void recibirDano(int danio) {
            int danoReal = danio - armadura;

            if (danoReal < 0) {
                danoReal = 0;
            }

            vida = vida - danoReal;

            if (vida < 0) {
                vida = 0;
            }
        }

        public void recibirDano(int danio, boolean ignoraArmadura) {
            int danoReal;

            if (ignoraArmadura) {
                danoReal = danio;
            } else {
                danoReal = danio - armadura;
            }

            if (danoReal < 0) {
                danoReal = 0;
            }

            vida = vida - danoReal;

            if (vida < 0) {
                vida = 0;
            }
        }

        public int atacar(int dano) {
            return dano;
        }

        public void mostrarEstado(String nombre) {
            System.out.println(nombre + " - Vida: " + vida
                    + " Armadura: " + armadura);
        }
    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Ejercicio19 ejercicio = new Ejercicio19();

        Personaje jugador = ejercicio.new Personaje(100, 20);
        Personaje jefe = ejercicio.new Personaje(150, 0);

        System.out.println("Liberando el END");
        jugador.mostrarEstado("Steve");
        jefe.mostrarEstado("La dragona");

        System.out.println("La dragona escupe su aliento");
        jugador.recibirDano(30);
        jugador.mostrarEstado("Steve");

        System.out.println("Steve le pega con un mazo");
        System.out.print("Ingrese el daño que hace Steve con el mazo: ");
        int dano = leer.nextInt();

        dano = jugador.atacar(dano);
        jefe.recibirDano(dano);
        jugador.mostrarEstado("Steve");
        jefe.mostrarEstado("La dragona");

        System.out.println("La dragona saca volando a steve");
        jugador.recibirDano(25, true);
        jugador.mostrarEstado("Steve");

        System.out.println("Steve le pega con una espada");
        System.out.print("Ingrese el daño que hace Steve con la espada: ");
        dano = leer.nextInt();

        dano = jugador.atacar(dano);
        jefe.recibirDano(dano);
        jugador.mostrarEstado("Jugador");
        jefe.mostrarEstado("La dragona");

        if (jefe.vida == 0) {
            System.out.println("¡Progreso realizado! Libera el END");
        } else {
            System.out.println("La dragona sigue viva");
        }

        leer.close();
    }
}
