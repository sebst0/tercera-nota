package Unidad1;

public class Ejercicio24 {
    public static void main(String[] args) {
        int [][] matriz = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };

        for (int[] filas : matriz) {
            for (int columnas : filas) {
                System.out.print(columnas + " ");
                
            }
            System.out.println();
        }
    }
    
}
