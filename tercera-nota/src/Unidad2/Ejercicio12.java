package Unidad2;

public class Ejercicio12 {

    class Inventario {

        public int agregarDiamantes(int cantidad) {
            return cantidad + 5;
        }

        public int agregarDiamantes(int cantidad, int extra) {
            return cantidad + extra;
        }

        public int agregarDiamantes(int cantidad, int extra, int precio) {
            return cantidad + extra - precio;
        }
    }

    public static void main(String[] args) {

        Ejercicio12 ejercicio = new Ejercicio12();
        Inventario inventario = ejercicio.new Inventario();

        int diamantes = 20;

        System.out.println("Diamantes iniciales: " + diamantes);

        diamantes = inventario.agregarDiamantes(diamantes);
        System.out.println("Despues de encontrar 5: " + diamantes);

        diamantes = inventario.agregarDiamantes(diamantes, 10);
        System.out.println("Despues de encontrar otros 10: " + diamantes);

        diamantes = inventario.agregarDiamantes(diamantes, 0, 8);
        System.out.println("Despues de comprar un pico: " + diamantes);

        System.out.println("Diamantes finales: " + diamantes);
    }
}
