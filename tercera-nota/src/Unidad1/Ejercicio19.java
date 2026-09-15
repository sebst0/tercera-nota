package Unidad1;
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        byte[] edades = new byte[5];
        for (int i = 0; i < edades.length; i++) {
            System.out.println("ingrese la edad de la persona " + i + ":");
            edades[i] = leer.nextByte();

            
        }
        // for (byte edad : edades) {
        //     System.out.println(edad);
        // }
        int longitudEdades = edades.length;
        for (int i = 0; i < longitudEdades; i++) {
            System.out.println("posicion " + i + ":" + edades [i]);
            
        }
        leer.close();


    }
    
}
