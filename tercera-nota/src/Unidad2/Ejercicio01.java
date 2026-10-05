package Unidad2;

public class Ejercicio01 {
    public static void main(String[] args) {

        int[][] cajas = {
            {10, 23, 40, 32, 54, 87, 31, 93, 63, 67},
            {13, 34, 32, 56, 76, 68, 12, 35, 86, 96},
            {81, 52, 17, 41, 75, 19, 99, 26, 29, 93}
        };

        int longitudFilas = cajas.length;
        int longitudColumnas = cajas[0].length;

        boolean detener = false;

        for (int i = 0; i < longitudFilas && !detener; i++) {
            for (int j = 0; j < longitudColumnas; j++) { 
                

                if (cajas[i][j] % 2 == 0) {
                    continue; 
                }
                
                if (cajas[i][j] > 80) {
                    System.out.println("el limite de peso ha sido superado en el pasillo " + (i+1) + ". saliendo del pasillo");
                    break; 
                }
                
                if (cajas[i][j] == 17) {
                    System.out.println("¡ALERTA! la caja con el codigo 17 ha sido detectada en el pasillo " + (i+1) + ", posición " + (j+1) + ". ¡se detiene todo el almacen!");
                    detener = true; 
                    break; 
                }
                
                System.out.println("inspeccionando pasillo " + (i+1) + " caja con valor " + cajas[i][j] + " posicion " + (j+1) + ")");
            }
        }
        
        System.out.println("inspeccion acabada");
    }
}