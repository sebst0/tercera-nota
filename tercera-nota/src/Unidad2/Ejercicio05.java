package Unidad2;

public class Ejercicio05 {
    
    public static void main(String[] args) {
        double[] precios = {15.5, 60.0, 45.9, 120.0, 90.0, 85.5};
        double limiteBusqueda = 50.0;
        int totalCaros = contarProductosCaros(precios, limiteBusqueda);
        System.out.println("los productos con precio mayor a " + limiteBusqueda + " son: " + totalCaros);
    }
   
    public static int contarProductosCaros(double[] precios, double limite) {
        int contador = 0;
        int longitud = precios.length;
        for (int i = 0; i < longitud; i++) {
            if (precios[i] > limite) {
                contador++;
            }
        }
        
        return contador;
    }
}

