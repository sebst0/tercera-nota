package Unidad1;

public class Ejercicio15 {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                j++;
            }
            
        }
        System.out.println("La cantidad de numeros pares entre 1 y 100 es: " + j);
    }
    
}
