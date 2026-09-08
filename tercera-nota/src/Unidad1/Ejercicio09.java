package Unidad1;

public class Ejercicio09 {
    public static void main(String[] args) {
        float nota = 4.2f;
        final float NOTA_EXCELENTE = 4.5f;
        final float NOTA_APROBADO = 3.0F;
        if (nota >= NOTA_EXCELENTE){
            System.out.println("excelente");
    } else if (nota >= NOTA_APROBADO){
        System.out.println("aprobado");
    } else {
        System.out.println("reprobado");
    }

}
    
}
