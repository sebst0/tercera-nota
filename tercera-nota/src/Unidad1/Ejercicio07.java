package Unidad1;
import java.util.Scanner;
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer digito ");
        double numero1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo digito ");
        double numero2 = scanner.nextDouble();
        System.out.println("Ingrese el tercer digito ");
        double numero3 = scanner.nextDouble();
        double media = (numero1 + numero2 + numero3) / 3;
        System.out.println("La media de los tres numeros es: " + media);
    }
    
}
