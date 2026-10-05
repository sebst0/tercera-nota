package Unidad2;

public class Ejercicio04 {

    public static void main(String[] args) {
        int[] Temperaturas = {20, 28, 15, 30, 22, 35};
        
        
        int diasCalurosos = analizarTemperaturas(Temperaturas);
        
        System.out.println("cantidad de dias con temperatura mayor a 25: " + diasCalurosos);
    }

     public static int analizarTemperaturas(int[] temperaturas) {
        int contador = 0;
        int longitud = temperaturas.length;
        for (int i = 0; i < longitud; i++) {
            if (temperaturas[i] > 25) {
                contador++; 
            }
        }
        
        return contador;
    }
}

