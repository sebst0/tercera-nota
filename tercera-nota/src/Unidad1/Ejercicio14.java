package Unidad1;
import java.util.Scanner;
public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer digito ");  
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo digito ");
        int numero2 = scanner.nextInt();
        System.out.println("Ingrese el tercer digito ");
        int numero3 = scanner.nextInt();
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El primer digito es el mayor");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El segundo digito es el mayor");
        } else {
            System.out.println("El tercer digito es el mayor");
        }
    }
    
}
