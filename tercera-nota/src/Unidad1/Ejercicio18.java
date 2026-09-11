package Unidad1;
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese numero que desea saber su tabla de multiplicar");
        int numero = leer.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.println(numero + " x " + i + " = " + (numero*i));
            
        }


}
}