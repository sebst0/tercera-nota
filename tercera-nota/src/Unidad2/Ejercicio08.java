package Unidad2;

public class Ejercicio08 {
    public static void main(String[] args) {
        int nivelesXp = 30; 

        System.out.println("XP antes de encantar la espada: " + nivelesXp);

        gastarExperiencia(nivelesXp);

    }

    public static void gastarExperiencia(int xp) {
        xp = xp - 15;
        System.out.println("XP despues de encantar la espada:" + xp);
    }
}
