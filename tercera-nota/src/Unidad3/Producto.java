package Unidad3;


public class Producto {

    private int codigo;
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(int cantidad, int codigo, String nombre, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;

    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }
    
}
