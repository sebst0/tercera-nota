package Unidad1;

public class Ejercicio05 {
    public static void main(String[] args) {
        double promo = 0.85;
        int precioPantalon = 30;
        int precioCamisa = 25;

        double totalPantalon = precioPantalon * promo;
        double totalCamisa = precioCamisa * promo;
        double total = totalPantalon + totalCamisa;
        double segundaCamisa = totalCamisa * 0.95;
        double totalTodo = total + segundaCamisa;

        System.out.println("Total pantalón: " + totalPantalon);
        System.out.println("Total camisa: " + totalCamisa);
        System.out.println("Total de los 2 productos: " + total);
        System.out.println("Total de la segunda camisa con 5% de descuento: " + segundaCamisa);
        System.out.println("Total de todos los productos: " + totalTodo);
    }
}