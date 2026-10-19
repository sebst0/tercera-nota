package Unidad2;

public class Ejercicio14 {

    public int agregarMaterial(int madera) {
        return madera + 5;
    }

    public int agregarMaterial(int madera, int cantidad) {
        return madera + cantidad;
    }

    public int agregarMaterial(int madera, int cantidad, int utilizados) {
        return madera + cantidad - utilizados;
    }

    public boolean construirCasa(int madera, int necesaria) {
        return madera >= necesaria;
    }

    public int construirCasa(int madera, int necesaria, int sobrante) {
        if (madera >= necesaria) {
            return madera - necesaria + sobrante;
        } else {
            return madera;
        }
    }

    public static void main(String[] args) {

        Ejercicio14 construccion = new Ejercicio14();

        int madera = 20;
        int piedra = 30;

        System.out.println("Madera inicial: " + madera);
        System.out.println("Piedra inicial: " + piedra);

        madera = construccion.agregarMaterial(madera);
        System.out.println("Despues de recoger madera: " + madera);

        madera = construccion.agregarMaterial(madera, 15);
        System.out.println("Despues de recoger 15 mas: " + madera);

        piedra = construccion.agregarMaterial(piedra, 20);
        System.out.println("Piedra recolectada: " + piedra);

        int maderaNecesaria = 25;

        if (construccion.construirCasa(madera, maderaNecesaria)) {
            madera = construccion.construirCasa(madera, maderaNecesaria, 0);
            System.out.println("Choza construida");
            System.out.println("Madera restante: " + madera);
        } else {
            System.out.println("No te alcanza");
        }


        System.out.println("lo que te queda es:");
        System.out.println("Madera: " + madera);
        System.out.println("Piedra: " + piedra);
    }
}

