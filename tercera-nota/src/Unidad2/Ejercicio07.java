package Unidad2;

class Profesion {
    String nombre;
    int nivel;
}

class Aldeano {
    String id;
    Profesion profesion;
}

public class Ejercicio07 {
    public static void main(String[] args) {
        Profesion librero = new Profesion();
        librero.nombre = "Bibliotecario";
        librero.nivel = 1;

        Aldeano aldeanovago = new Aldeano();
        aldeanovago.id = "Aldeano_1";
        aldeanovago.profesion = librero;

        curaZombie(aldeanovago);

        System.out.println("Fuera del metodo el oficio: " + aldeanovago.profesion.nombre + ", nivel: " + aldeanovago.profesion.nivel);
    }

    public static void curaZombie(Aldeano a) {
        
        a.profesion.nivel = a.profesion.nivel + 4; 

        Profesion herrero = new Profesion();
        herrero.nombre = "Herrero";
        herrero.nivel = 1;
        
        a.profesion = herrero;
        
        System.out.println("Dentro del metodo el oficio: " + a.profesion.nombre + ", nivel: " + a.profesion.nivel);
    }
}
