package Unidad2;

public class Ejercicio17 {

    class Jugador {

        int experiencia;
        int nivel;

        public Jugador(int experienciaInicial) {
            experiencia = Math.max(0, experienciaInicial);
            actualizarNivel();
        }

        public void actualizarNivel() {
            nivel = experiencia / 100 + 1;
        }

        public void ganarExperiencia() {
            experiencia = experiencia + 10;
            actualizarNivel();
        }

        public void ganarExperiencia(int cantidad) {
            if (cantidad > 0) {
                experiencia = experiencia + cantidad;
                actualizarNivel();
            }
        }

        public void ganarExperiencia(int cantidad, int limite) {
            if (cantidad > 0 && limite >= 0) {
                experiencia = experiencia + cantidad;

                if (experiencia > limite) {
                    experiencia = limite;
                }

                actualizarNivel();
            }
        }
    }

    public static void main(String[] args) {

        Ejercicio17 ejercicio = new Ejercicio17();
        Jugador jugador = ejercicio.new Jugador(0);

        System.out.println("Cada 100 de experiencia se sube de nivel");
        System.out.println("Experiencia inicial: " + " " + jugador.experiencia);
        System.out.println("Nivel inicial: " + jugador.nivel);

        jugador.ganarExperiencia();
        System.out.println("despues de matar mobs gana" + " " + jugador.experiencia + " de experiencia");
        System.out.println("Experiencia: " + jugador.experiencia);
        System.out.println("Nivel: " + jugador.nivel);

        jugador.ganarExperiencia(90);
        System.out.println("despues de matar mobs gana" + " " + jugador.experiencia + " de experiencia");
        System.out.println("Experiencia: " + jugador.experiencia);
        System.out.println("Nivel: " + jugador.nivel);

        jugador.ganarExperiencia(150, 250);
        System.out.println("despues de matar mobs gana" + " " + jugador.experiencia + " de experiencia");
        System.out.println("Experiencia final: " + jugador.experiencia);
        System.out.println("Nivel final: " + jugador.nivel);
    }
}