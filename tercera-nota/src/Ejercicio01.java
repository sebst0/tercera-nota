import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

    Producto[] productos = new Producto[20];
    int cantidad = 0;

    System.out.println("codigo: ");
    int codigo = leer.nextInt();

    System.out.println("precio: ");
    double precio = leer.nextDouble();

    if (codigo > 0 && precio > 0 && cantidad < productos.length) {
        productos[cantidad] = new Producto(cantidad, codigo, null, precio);
        cantidad++;
        System.out.println("producto registrado");
    }
    leer.close();
}
}
