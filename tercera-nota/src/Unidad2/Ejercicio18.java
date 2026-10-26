package Unidad2;

public class Ejercicio18 {

    class Inventario {

        int hierro;
        int madera;

        public Inventario(int hierroInicial, int maderaInicial) {
            hierro = hierroInicial;
            madera = maderaInicial;
        }

        public void agregarMaterial(int cantidad) {
            if (cantidad > 0) {
                hierro = hierro + cantidad;
            }
        }

        public void agregarMaterial(int cantidad, boolean esMadera) {
            if (cantidad > 0) {
                if (esMadera) {
                    madera = madera + cantidad;
                } else {
                    hierro = hierro + cantidad;
                }
            }
        }

        public boolean fabricarObjeto(int hierroNecesario, int maderaNecesaria) {
            if (hierro >= hierroNecesario && madera >= maderaNecesaria) {
                hierro = hierro - hierroNecesario;
                madera = madera - maderaNecesaria;
                return true;
            } else {
                return false;
            }
        }

        public void mostrarInventario() {
            System.out.println("Hierro: " + hierro);
            System.out.println("Madera: " + madera);
        }
    }

    public static void main(String[] args) {

        Ejercicio18 ejercicio = new Ejercicio18();
        Inventario inventario = ejercicio.new Inventario(30, 20);

        System.out.println("Cofre");
        inventario.mostrarInventario();

        inventario.agregarMaterial(10);
        inventario.agregarMaterial(5, true);

        System.out.println(" Despues de recoger materiales se consiguio");
        inventario.mostrarInventario();

        System.out.println(" Fabricacion de una espada");

        if (inventario.fabricarObjeto(5, 2)) {
            System.out.println("Se pudo fabricar");
        } else {
            System.out.println("No le alcanzo, consiga materiales puerco");
        }

        inventario.mostrarInventario();

        System.out.println("Fabricacion de un pico");

        if (inventario.fabricarObjeto(3, 3)) {
            System.out.println("Se pudo fabricar");
        } else {
            System.out.println("No le alcanzo, consiga materiales puerco");
        }

        System.out.println("Inventario del cofre final ");
        inventario.mostrarInventario();
    }
}
