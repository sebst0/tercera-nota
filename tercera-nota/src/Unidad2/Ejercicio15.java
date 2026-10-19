package Unidad2;

public class Ejercicio15 {

    class Bloque {

        String material;
        int resistencia;

        public Bloque(String material, int resistenciaInicial) {
            this.material = material;
            resistencia = resistenciaInicial;
        }
    }

    public int minar(int resistencia) {
        resistencia = resistencia - 2;

        if (resistencia < 0) {
            resistencia = 0;
        }

        return resistencia;
    }

    public int minar(int resistencia, int fuerza) {
        resistencia = resistencia - fuerza;

        if (resistencia < 0) {
            resistencia = 0;
        }

        return resistencia;
    }

    public void minar(Bloque bloque) {
        bloque.resistencia = bloque.resistencia - 2;

        if (bloque.resistencia < 0) {
            bloque.resistencia = 0;
        }
    }

    public void minar(Bloque bloque, int fuerza) {
        bloque.resistencia = bloque.resistencia - fuerza;

        if (bloque.resistencia < 0) {
            bloque.resistencia = 0;
        }
    }

    public boolean bloqueDestruido(Bloque bloque) {
        return bloque.resistencia == 0;
    }

    public static void main(String[] args) {


        Ejercicio15 mineria = new Ejercicio15();

        Bloque piedra = mineria.new Bloque("Piedra", 10);
        Bloque diamante = mineria.new Bloque("Mineral de diamante", 12);

        int resistencia = 10;

        System.out.println("Resistencia inicial: " + resistencia);

        int resultado = mineria.minar(resistencia);
        System.out.println("Despues de un golpe: " + resultado);

        resultado = mineria.minar(resistencia, 6);
        System.out.println("Con un golpe mas fuerte: " + resultado);

        System.out.println("Resistencia original: " + resistencia);

        System.out.println("Minando piedra");
        System.out.println("Resistencia inicial: " + piedra.resistencia);

        mineria.minar(piedra);
        System.out.println("Primer golpe: " + piedra.resistencia);

        mineria.minar(piedra, 4);
        System.out.println("Segundo golpe: " + piedra.resistencia);

        if (mineria.bloqueDestruido(piedra)) {
            System.out.println("se destruyo la piedra");
        } else {
            System.out.println("no se ha destruido la piedra");
        }

        System.out.println("Minando mineral de diamante");
        System.out.println("Resistencia inicial: " + diamante.resistencia);

        mineria.minar(diamante, 5);
        System.out.println("Despues de usar el pico: " + diamante.resistencia);

        mineria.minar(diamante, 7);
        System.out.println("Despues del segundo golpe: " + diamante.resistencia);

        if (mineria.bloqueDestruido(diamante)) {
            System.out.println("se pico el diamante");
        } else {
            System.out.println("no se ha minado");
        }
    }
}
