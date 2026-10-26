package Unidad2;

import java.util.Scanner;

public class Ejercicio20 {

    class Aldeano {

        int nivel;
        int experiencia;
        int tratos;

        public Aldeano() {
            nivel = 1;
            experiencia = 0;
            tratos = 0;
        }

        public void tradear() {
            experiencia = experiencia + 10;
            tratos = tratos + 1;
            actualizarNivel();
        }

        public void tradear(int experienciaGanada) {
            if (experienciaGanada > 0) {
                experiencia = experiencia + experienciaGanada;
                tratos = tratos + 1;
                actualizarNivel();
            } else {
                System.out.println("la experiencia debe ser positiva");
            }
        }

        public void tradear(int experienciaGanada, int limite) {
            if (experienciaGanada > 0 && limite > 0) {
                experiencia = experiencia + experienciaGanada;

                if (experiencia > limite) {
                    experiencia = limite;
                }

                tratos = tratos + 1;
                actualizarNivel();
            } else {
                System.out.println("Los valores deben ser positivos");
            }
        }

        public void actualizarNivel() {
            nivel = experiencia / 50 + 1;

            if (nivel > 5) {
                nivel = 5;
            }
        }

        public void mostrarEstado() {
            System.out.println("Experiencia: " + experiencia);
            System.out.println("Tradeos hechos: " + tratos);

            if (nivel == 1) {
                System.out.println("Novato");
            } else if (nivel == 2) {
                System.out.println("Aprendiz");
            } else if (nivel == 3) {
                System.out.println("Oficial");
            } else if (nivel == 4) {
                System.out.println("Experto");
            } else {
                System.out.println("Maestro");
            }
        }
    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Ejercicio20 ejercicio = new Ejercicio20();
        Aldeano bibliotecario = ejercicio.new Aldeano();

        int opcion;

        do {
            System.out.println("\nAldeano protegido (bibliotecario)");
            System.out.println("1. Comprar libro");
            System.out.println("2. Vender papel");
            System.out.println("3. Comprar libro de reparacion");
            System.out.println("4. Comprar estanteria");
            System.out.println("5. Comprar etiqueta");
            System.out.println("6. Mostrar estado del aldeano");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Has tradeado por un libro");
                    bibliotecario.tradear();
                    bibliotecario.mostrarEstado();
                    break;

                case 2:
                    System.out.println("Has tradeado con papel");
                    bibliotecario.tradear(15);
                    bibliotecario.mostrarEstado();
                    break;

                case 3:
                    System.out.println("Has tradeado por un libro de repacion");
                    bibliotecario.tradear(25);
                    bibliotecario.mostrarEstado();
                    break;

                case 4:
                    System.out.println("Has tradeado por una estanteria");
                    bibliotecario.tradear(20, 200);
                    bibliotecario.mostrarEstado();
                    break;

                case 5:
                    System.out.println("Has tradeado por una etiqueta.");
                    bibliotecario.tradear(30);
                    bibliotecario.mostrarEstado();
                    break;

                case 6:
                    bibliotecario.mostrarEstado();
                    break;

                case 7:
                    System.out.println("dejando de tradear");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 7);

        leer.close();
    }
}