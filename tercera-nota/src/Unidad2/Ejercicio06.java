package Unidad2;

class Espada {
    String material;
    int durabilidad;
}

class tryHard {
    String nombre;
    Espada espadaActual;
}

public class Ejercicio06 {
    public static void main(String[] args) {
        Espada espadaDeNetherite = new Espada();
        espadaDeNetherite.material = "Netherite";
        espadaDeNetherite.durabilidad = 1500;

        tryHard jugador = new tryHard();
        jugador.nombre = "sebz";
        jugador.espadaActual = espadaDeNetherite;

        peleaDragon(jugador.espadaActual);

        System.out.println("LA espada final de " + jugador.nombre + ": " + jugador.espadaActual.material + ", durabilidad: " + jugador.espadaActual.durabilidad);
    }

    public static void peleaDragon(Espada espada) {
        espada.durabilidad = 0;
        
       
        espada = new Espada();
        espada.material = "Madera";
        espada.durabilidad = 60;
        
        System.out.println("Dentro del metodo el Material: " + espada.material + ", durabilidad: " + espada.durabilidad);
    }
}
