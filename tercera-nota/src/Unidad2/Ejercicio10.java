package Unidad2;

class Item {
    String nombre;
}

class Barril {
    Item item1;
    Item item2;
}

public class Ejercicio10 {
    public static void main(String[] args) {
        Item espada = new Item();
        espada.nombre = "Espada de Diamante";

        Item escudo = new Item();
        escudo.nombre = "Escudo";

        Barril barril = new Barril();
        barril.item1 = espada;
        barril.item2 = escudo;

        crafteo(barril);

        System.out.println("Item 1: " + barril.item1.nombre);
        System.out.println("Item 2: " + barril.item2.nombre);
    }

    public static void crafteo(Barril c) {
    
        c.item1.nombre = "Espada rota";

        c.item2 = new Item();
        c.item2.nombre = "Totem de inmortalidad";

        c = new Barril();
        c.item1 = new Item();
        c.item1.nombre = "Manzana dorada";
    }
}
