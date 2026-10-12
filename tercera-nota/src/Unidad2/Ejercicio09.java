package Unidad2;

class Item {
    String nombre;
    int cantidad;
}

class Cofre {
    String ubicacion;
    Item contenido;
}

public class Ejercicio09 {
    public static void main(String[] args) {
        Item diamante = new Item();
        diamante.nombre = "Diamante";
        diamante.cantidad = 3;

        Cofre cofreEnder = new Cofre();
        cofreEnder.ubicacion = "rancho";
        cofreEnder.contenido = diamante;

        System.out.println("Antes del raideo en el cofre hay: " + cofreEnder.contenido.cantidad + " " + cofreEnder.contenido.nombre);

        raideo(cofreEnder);

        System.out.println("Despues del raideo en el cofre hay: " + cofreEnder.contenido.cantidad + " " + cofreEnder.contenido.nombre);
    }

    public static void raideo(Cofre c) {
        c.contenido.nombre = "papa";
        c.contenido.cantidad = 1;

        System.out.println("Dentro del raideo en el cofre hay: " + c.contenido.cantidad + " " + c.contenido.nombre);
    }
}