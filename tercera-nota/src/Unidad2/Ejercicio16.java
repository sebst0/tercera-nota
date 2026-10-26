package Unidad2;

public class Ejercicio16 {

    class Espada {

        int dano;

        public Espada(int danioInicial) {
            dano = danioInicial;
        }

        public void mejorarEspada() {
            dano = dano + 5;
        }

        public void mejorarEspada(int cantidad) {
            dano = dano + cantidad;
        }

        public void mejorarEspada(int cantidad, int limite) {
            dano = dano + cantidad;

            if (dano > limite) {
                dano = limite;
            }
        }
    }

    public static void main(String[] args) {

        Ejercicio16 ejercicio = new Ejercicio16();
        Espada espada = ejercicio.new Espada(10);

        System.out.println("Espada de hierro -la caza tigres-");
        System.out.println("Daño inicial: " + espada.dano);

        espada.mejorarEspada();
        System.out.println("Despues de hacerla diamante: " + espada.dano);

        espada.mejorarEspada(10);
        System.out.println("Despues de mejrarla a netherite: " + espada.dano);

        espada.mejorarEspada(20, 40);
        System.out.println("Daño antes de los encantamientos: " + espada.dano);

        System.out.println("Aplicando encantamientos");

        espada.mejorarEspada(5);
        System.out.println("Encantamiento Filo V: " + espada.dano);

        espada.mejorarEspada(3);
        System.out.println("Encantamiento Castigo V: " + espada.dano);

        espada.mejorarEspada(4);
        System.out.println("Encantamiento Aspecto Igneo II: " + espada.dano);

        espada.mejorarEspada(10, 60);
        System.out.println("Encantamiento Barrido III: " + espada.dano);

        System.out.println("Daño total de la espada: " + espada.dano);
    }
}