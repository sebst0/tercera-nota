package Unidad2;

import java.util.Scanner;

// Clase de los heroes
class SuperHero {

    private String nombre;
    private int vida;
    private int vidaMaxima;
    private int armadura;
    private int fase;
    private boolean curacion;
    private boolean evolucion;

    // constructor
    public SuperHero(String nombreInicial, int vidaInicial,
            int armaduraInicial) {

        nombre = nombreInicial;
        vida = vidaInicial;
        vidaMaxima = vidaInicial;
        armadura = armaduraInicial;
        fase = 1;
        curacion = false;
        evolucion = true;
    }

    // encapsular
    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getArmadura() {
        return armadura;
    }

    public int getFase() {
        return fase;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void setVida(int nuevaVida) {
        vida = Math.max(0, Math.min(vidaMaxima, nuevaVida));
    }

    // evolucion
    public void evolucionar() {
        fase = 2;
        armadura += 10;
        evolucion = false;

        System.out.println(nombre + " ha evolucionado");
        System.out.println("Su armadura aumenta 10 puntos");
        System.out.println("Sus ataques hacen 20 puntos de daño adicionales");
    }

    //la pregunta de la evolucion
    public void preguntarEvolucion(Scanner leer) {

        if (fase == 1 && evolucion == true && vida > 0 && vida <= vidaMaxima / 2) {

            System.out.println("\n" + nombre + " tiene " + vida + " HP de " + vidaMaxima);
            System.out.println("tiene 50% de vida");

            String respuesta;

            while (true) {
                System.out.print("Deseas evolucionar? s/n: ");
                respuesta = leer.next();

                if (respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("n")) {
                    break;
                }

                System.out.println("Escribe s o n");
            }

            evolucion = false;

            if (respuesta.equalsIgnoreCase("s")) {
                evolucionar();
            } else {
                System.out.println(nombre + " no evoluciona");
            }
        }
    }

    public void curar(Scanner leer) {

        if (curacion || vida == vidaMaxima) {
            return; // no se cura porq tiene la vida al maximo
        }

        String respuesta;

        while (true) {
            System.out.println("\nVida actual: " + vida + "/" + vidaMaxima);
            System.out.println("Puedes recuperar 30 HP una sola ve");
            System.out.print("queres curarte antes de atacar? s/n: ");
            respuesta = leer.next();

            if (respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("n")) {
                break;
            }

            System.out.println("Escribe s o n");
        }

        if (respuesta.equalsIgnoreCase("s")) {
            vida = Math.min(vidaMaxima, vida + 30);
            curacion = true;

            System.out.println(nombre + " se ha curado");
            System.out.println("Vida actual: " + vida);
        }
    }

    public int calcularAtaque(Scanner leer) {

        System.out.println("\n" + nombre);
        System.out.println("Ataque normal. Puedes hacer entre 1 y 60 de daño");
        System.out.println("Ataque especial. Su daño es de 90");
        System.out.println("1. Ataque normal");
        System.out.println("2. Ataque especial");

        int opcion;

        while (true) {
            System.out.print("Elige tu ataque: ");

            if (leer.hasNextInt()) {
                opcion = leer.nextInt();

                if (opcion == 1 || opcion == 2) {
                    break;
                }
            } else {
                leer.next();
            }

            System.out.println("Elige entre la opcion 1 o 2");
        }

        int ataqueTotal;

        if (opcion == 2) {
            ataqueTotal = 90;
            System.out.println("selecciono ataque especial");
            System.out.println("daño de 90 puntos");
        } else {
            ataqueTotal = ataqueNormal(leer);
        }

        if (fase == 2) {
            ataqueTotal += 20;
            System.out.println("Obtuvo una bonificacion por evolucion de 20 puntos");
        }

        System.out.println("Ataque final: " + ataqueTotal);

        return ataqueTotal;
    }

    private int ataqueNormal(Scanner leer) {

        int dano;

        while (true) {
            System.out.print("Escribe el daño q deseas hacer (1-60): ");

            if (leer.hasNextInt()) {
                dano = leer.nextInt();

                if (dano > 0 && dano <= 60) {
                    break;
                }
            } else {
                leer.next();
            }

            System.out.println("El daño debe ser mayor que 0 y no pasar de 60");
        }

        System.out.println("Daño base: " + dano);

        return dano;
    }
}

// Clase villano
class Villano {

    private String nombre;
    private int vida;
    private int vidaMaxima;
    private int armadura;
    private int fase;
    private boolean curacion;
    private boolean evolucion;

    public Villano(String nombreInicial, int vidaInicial,
            int armaduraInicial) {

        nombre = nombreInicial;
        vida = vidaInicial;
        vidaMaxima = vidaInicial;
        armadura = armaduraInicial;
        fase = 1;
        curacion = false;
        evolucion = true;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getArmadura() {
        return armadura;
    }

    public int getFase() {
        return fase;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void setVida(int nuevaVida) {
        vida = Math.max(0, Math.min(vidaMaxima, nuevaVida));
    }

    public void evolucionar() {
        fase = 2;
        armadura += 10;
        evolucion = false;

        System.out.println(nombre + " ha evolucionado");
        System.out.println("Su armadura aumenta 10 puntos");
        System.out.println("Sus ataques hacen 20 puntos de daño adicionales");
    }

    public void preguntarEvolucion(Scanner leer) {

        if (fase == 1 && evolucion == true && vida > 0 && vida <= vidaMaxima / 2) {

            System.out.println("\n" + nombre + " tiene " + vida+ " HP de " + vidaMaxima);
            System.out.println("tiene 50% de vida");

            String respuesta;

            while (true) {
                System.out.print("Deseas evolucionar? s/n: ");
                respuesta = leer.next();

                if (respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("n")) {
                    break;
                }

                System.out.println("Escribe s o n");
            }

            evolucion = false;

            if (respuesta.equalsIgnoreCase("s")) {
                evolucionar();
            } else {
                System.out.println(nombre + " no evoluciona");
            }
        }
    }

    public void curar(Scanner leer) {

        if (curacion || vida == vidaMaxima) {
            return;
        }

        String respuesta;

        while (true) {
            System.out.println("\nVida actual: " + vida + "/" + vidaMaxima);
            System.out.println("Puedes recuperar 30 HP una sola vez");
            System.out.print("Quieres curarte antes de atacar? s/n: ");
            respuesta = leer.next();

            if (respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("n")) {
                break;
            }

            System.out.println("Escribe s o n");
        }

        if (respuesta.equalsIgnoreCase("s")) {
            vida = Math.min(vidaMaxima, vida + 30);
            curacion = true;

            System.out.println(nombre + " se ha curado");
            System.out.println("Vida actual: " + vida);
        }
    }

    public int calcularAtaque(Scanner leer) {

        System.out.println("\n" + nombre);
        System.out.println("Ataque normal. Puedes hacer entre 1 y 60 de daño");
        System.out.println("Ataque especial. Su daño es de 90");
        System.out.println("1. Ataque normal");
        System.out.println("2. Ataque especial");

        int opcion;

        while (true) {
            System.out.print("Elige tu ataque: ");

            if (leer.hasNextInt()) {
                opcion = leer.nextInt();

                if (opcion == 1 || opcion == 2) {
                    break;
                }
            } else {
                leer.next();
            }

            System.out.println("Elige entre la opcion 1 o 2");
        }

        int ataqueTotal;

        if (opcion == 2) {
            ataqueTotal = 90;
            System.out.println("selecciono ataque especial");
            System.out.println("Daño de 90 puntos");
        } else {
            ataqueTotal = ataqueNormal(leer);
        }

        if (fase == 2) {
            ataqueTotal += 20;
            System.out.println("Obtuvo una bonificacion por evolucion de 20 puntos");
        }

        System.out.println("Ataque total: " + ataqueTotal);

        return ataqueTotal;
    }
    // es privada porq nada mas la clase puede acceder a ella ya q no hay necesidad q las demas clases la invoquen

    private int ataqueNormal(Scanner leer) {

        int dano;

        while (true) {
            System.out.print("Escribe el daño normal que quieres hacer 1-60 : ");

            if (leer.hasNextInt()) {
                dano = leer.nextInt();

                if (dano > 0 && dano <= 60) {
                    break;
                }
            } else {
                leer.next();
            }

            System.out.println("El daño debe ser mayor que 0 y no superar 60.");
        }

        System.out.println("Daño base: " + dano);

        return dano;
    }
}

// Clase principal
public class Batalla {

    //muestra el estado
    public static void mostrarEstado(SuperHero personaje) {
        //personaje es una variable que va a señalar a un objeto que ya existe.
        System.out.println("\n" + personaje.getNombre() + "  Vida: " + personaje.getVida() + "/" + personaje.getVidaMaxima() + "  Armadura: " + personaje.getArmadura() + "  Fase: " + personaje.getFase());
                // se usa get ps porq los parametros o atributos de la clase superhero son privados y asi se pueden leer
    }

    public static void mostrarEstado(Villano personaje) {
        System.out.println("\n" + personaje.getNombre() + "  Vida: " + personaje.getVida() + "/" + personaje.getVidaMaxima() + "  Armadura: " + personaje.getArmadura() + "  Fase: " + personaje.getFase());
                // lo mismo q antes
    }

    public static void aplicarDano(SuperHero atacante, Villano defensor, int ataque) {
            // como el heroe es el q ataca se llama atacante y el villano defensor 
        int danoReal = Math.max(0, ataque - defensor.getArmadura());
        // el max y el 0 para q si el ataque llega a dar valores nagtivos tome el 0 y si no tome el otro valor
            // se llama dañoreal porq la armadura le resta un pedazo del ataque por lo q no es todo el ataque q haga el heroe q se come
        defensor.setVida(defensor.getVida() - danoReal);
        // se calcula el daño hecho
        mostrarImpacto(atacante.getNombre(), defensor.getNombre(), danoReal, defensor.getVida());
        // le pasa a mostrarimpacto esos parametros
    }

    public static void aplicarDano(Villano atacante, SuperHero defensor, int ataque) {

        int danoReal = Math.max(0, ataque - defensor.getArmadura());

        defensor.setVida(defensor.getVida() - danoReal);

        mostrarImpacto(atacante.getNombre(), defensor.getNombre(), danoReal, defensor.getVida());
    }

    // esos valores q se mandaron son los q se crean aca nuevos con otros nombres
    // Se mandan solo nombres y números (no objetos), por eso este método sirve para héroes y villanos
    public static void mostrarImpacto(String atacante, String defensor, int dano, int vidaRestante) {
        // ese daño es dañoreal

        if (dano > 0) {
            System.out.println("\n" + atacante + " causa " + dano + " de daño a " + defensor + ".");
        } else {
            System.out.println("\n" + defensor + " bloquea todo el ataque.");
        }

        System.out.println("Vida restante de " + defensor + ": " + vidaRestante + " HP.");
    }

    // se crea arrays para almacenar los datos de cada uno

    public static void   iniciarBatalla(SuperHero[] heroes,Villano[] villanos, Scanner leer) {
        int longitudHeroes = heroes.length;
        int longitudVillanos = villanos.length;
        // la cantidad de duelos depende de la cantidad de villanos y heroes q hayan y se toma es el menor
        int duelos = Math.min(longitudHeroes, longitudVillanos);

        System.out.println("Batalla de Heroes VS Villanos");
        System.out.println("Ataque normal: de 1 a 60 de daño");
        System.out.println("Ataque especial: 90 de daño");
        System.out.println("Curación: 30 HP una sola vez por personaje");
        System.out.println("Al llegar al 50% de vida se puede evolucionar");

        for (int i = 0; i < duelos; i++) {

            SuperHero heroe = heroes[i];
            Villano villano = villanos[i];

            System.out.println("\n--------------------------------");
            System.out.println("Duelo " + (i + 1));
            System.out.println(heroe.getNombre() + " VS " + villano.getNombre());
            System.out.println("----------------------------------");

            int turno = 1;

            while (heroe.estaVivo() && villano.estaVivo()) {

                System.out.println("\n--- Turno " + turno + " ---");
                // se invoca el estado de los 2 para q vean sus estadisticas antes de jugar
                mostrarEstado(heroe);
                mostrarEstado(villano);

                // Turno del heroe
                heroe.preguntarEvolucion(leer);
                // si se muere se acaba
                if (!heroe.estaVivo()) {
                    break;
                }

                heroe.curar(leer);

                System.out.println("\nTurno de " + heroe.getNombre());

                int ataqueHeroe = heroe.calcularAtaque(leer);

                aplicarDano(heroe, villano, ataqueHeroe);

                if (!villano.estaVivo()) {
                    break;
                }

                // Turno del villano
                villano.preguntarEvolucion(leer);
                villano.curar(leer);

                System.out.println("\nTurno de " + villano.getNombre());

                int ataqueVillano = villano.calcularAtaque(leer);

                aplicarDano(villano, heroe, ataqueVillano);

                if (!heroe.estaVivo()) {
                    break;
                }
                // si muere se acaba
                turno++;
            }

            System.out.println("\n--- RESULTADO DEL DUELO ---");

            if (heroe.estaVivo()) {
                System.out.println(heroe.getNombre() + " ha ganado");
            } else {
                System.out.println(villano.getNombre() + " ha ganado");
            }

            System.out.println("Vida final de " + heroe.getNombre() + ": " + heroe.getVida());

            System.out.println("Vida final de " + villano.getNombre() + ": " + villano.getVida());
        }

        System.out.println("\n--- FIN DE LA BATALLA ---");
    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        SuperHero[] equipoHeroes = {
            // crea los objetos dentro de la clase
            new SuperHero("Iron Man", 160, 25),
            new SuperHero("Thor", 200, 20),
            new SuperHero("Spider-Man", 130, 15)
        };

        Villano[] equipoVillanos = {
            new Villano("Duende Verde", 150, 20),
            new Villano("Thanos", 220, 30),
            new Villano("Loki", 120, 10)
        };

        iniciarBatalla(equipoHeroes, equipoVillanos, leer);

        leer.close();
    }
}


