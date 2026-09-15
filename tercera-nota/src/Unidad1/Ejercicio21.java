package Unidad1;

public class Ejercicio21 {
    
public static void main(String[] args) {
    int[] numeros = {12, 45, 8, 21, 91, 33, 11};
    int mayorNumero = numeros[0];
    int posicionMayor = 0;
    int buscar = 91;
    boolean encontrado = false;
    for (int i = 1; i < numeros.length; i++) {
        if (numeros[i] == buscar) {
            encontrado = true;
            break; 

            
        }
        // if (numeros[i]> mayorNumero) {
        //         mayorNumero = numeros[i];
        //         posicionMayor = i;
        //     }
        
    }
    if (encontrado) {
        System.out.println("numero encontrado");
        
    } else {
        System.out.println("numero no encontrado");
    }
    // System.out.println("el mayor es: " + mayorNumero);
}
}
