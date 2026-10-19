package Unidad2;

public class Ejercicio11 {

    static void atacar(int dano) {
     System.out.println("Daño causado: " + dano);
    }

    static void atacar(int dano, String arma) {
    System.out.println("El arma " + arma + " causa " + dano + " de daño");
    }

    public static void main(String[] args) {
    atacar(7);
    atacar(10, "Espada de diamante");
    }
    
}
