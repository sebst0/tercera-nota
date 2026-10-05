package Unidad2;

public class Ejercicio03 {
    public static void main(String[] args) {
        double area = calcularArea(10, 30);
        System.out.println("el area es: " + area );
        
    }

    public static double calcularArea(int a, int b){
        double area = (a * b)/2;
        return area;

    }
}
