package Unidad1;
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) { 
    Scanner leer = new Scanner (System.in);
    System.out.println("ingrese un numero");
    int numero = leer.nextInt();
    int i = 1;
    int factorial = 1;
    while (i<=numero) {
        factorial *= i;
        i++;
        
    }
    System.out.println("el factorial de " + numero + " es: " + factorial);
}

}
