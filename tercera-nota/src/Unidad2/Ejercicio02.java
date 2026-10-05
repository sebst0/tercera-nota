package Unidad2;

public class Ejercicio02 {
    public static void main(String[] args) {
        int longitud = 10;
        for (int i = 1; i <= longitud; i++) {

            if (i == 4 || i == 8) {
                continue;
            }
            
            if (i==9) {
                break;
            }
           
            System.out.println("casilla actual: " + (i));
        }
        
        System.out.println("juego terminado");
    }
}
    

