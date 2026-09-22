package Unidad1;

public class Ejercicio25 {
    public static void main(String[] args) {
        int [][] matriz = {
            {10,20,30},
            {40,50,60},
            
        };
        int longitudFilas = matriz.length;
        int longitudColumnas = matriz[0].length;
       for (int i = 0; i < longitudFilas; i++) {
        for (int j = 0; j < longitudColumnas; j++) {
            System.out.print(matriz[i][j] + " ");
            
        }
        System.out.println();
       }
    }
    
}
