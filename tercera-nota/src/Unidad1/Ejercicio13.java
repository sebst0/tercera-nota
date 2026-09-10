package Unidad1;
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer digito ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo digito ");
        int numero2 = scanner.nextInt();
        System.out.println("Ingrese el tercer digito ");
        int numero3 = scanner.nextInt();
        System.out.println("El primer digito es mayor que el segundo pero menor que el tercero? " + (numero1 > numero2 && numero1 < numero3));
    }
}
