package Unidad1;

public class Ejercicio06 {
    public static void main(String[] args) {
        int cantidadInicial = 1000;
        final int RETIROSEMANAL = 200;
        int semanas = 4; // cantidad de semans que tiene un mes
        int totalRetiro = RETIROSEMANAL * semanas;
        int cantidadFinal = cantidadInicial - totalRetiro;
        System.out.println("Cantidad inicial: " + cantidadInicial);
        System.out.println("Total retidado: " + totalRetiro);
        System.out.println("cantidad de semanas en las que va a retirar: " + semanas);
        System.out.println("le quedara al final del mes la cantidad de: " + cantidadFinal);
    }
    
}
