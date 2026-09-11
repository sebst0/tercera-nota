package Unidad1;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. sumar");
        System.out.println("2. restar");
        System.out.println("3. multiplicar");
        System.out.println("4. dividir");
        int opcion = scanner.nextInt();
        System.out.println("Ingrese el primer digito ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo digito ");
        int numero2 = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("resultado: " + (numero1+numero2));
                break;
            case 2:
                System.out.println("resultado: " + (numero1-numero2));
                break;
            case 3:
                System.out.println("resultado: " + (numero1*numero2));
                break;
            case 4: 
                System.out.println("resultado: " + (numero1/numero2));
        
            default:
                System.out.println("opcion incorrecta");
                break;
        }
        
        }

    }
    

