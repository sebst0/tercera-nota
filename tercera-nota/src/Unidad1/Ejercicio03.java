
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese su nombre");
        String nombre = leer.nextLine();

        System.out.println("ingrese su edad");
         int edad = leer.nextInt();

        System.out.println("ingrese su altura");
        double altura = leer.nextDouble();

        System.out.println("Hola amigo, tu nombre es" + nombre + ". Tienes " + edad + " años y tu altura es de " + altura);
        
    }
    
}
