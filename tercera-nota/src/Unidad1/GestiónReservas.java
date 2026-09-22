package Unidad1;
import java.util.Scanner;

public class GestiónReservas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String clientes[] = new String[6];
        String estadoHabitacion[] = {"libre", "libre", "libre", "libre", "libre", "libre"};
        String habitaciones[] = {"101", "102", "103", "104", "105", "106"};
        int nochesReservadas[] = new int[6];
        float preciosPorNoche[] = new float[6];
        
        int opcion;

        do {

        System.out.println("        menú       ");
        System.out.println("1. Reservar habitación");
        System.out.println("2. Cancelar reserva");
        System.out.println("3. Mostrar reporte");
        System.out.println("4. salir");
        opcion = leer.nextInt();

        switch (opcion) {
            case 1:

                leer.nextLine();
                System.out.println("Ingrese el nombre del cliente");
                String nombre = leer.nextLine();
                System.out.println("Ingrese el numero de la habitacion (101, 102, 103, 104, 105, 106)");
                int numeroHabitacion = leer.nextInt(); 


                int i = 6;

                if (numeroHabitacion == 101) {
                    i = 0; 
                }
                if (numeroHabitacion == 102) {
                    i = 1; 
                }
                if (numeroHabitacion == 103) {
                    i = 2; 
                }
                if (numeroHabitacion == 104) {
                    i = 3; 
                }
                if (numeroHabitacion == 105) {
                    i = 4; 
                }
                if (numeroHabitacion == 106) {
                    i = 5; 
                }

                if (i == 6) {
                    System.out.println("error, habitacion equivocada");
                    
                }


                if (estadoHabitacion[i].equals("X")) {
                    System.out.println("La habitación " + habitaciones[i] + " esta ocupada");
                } else {


                System.out.println("ingrese el numero de noches");
                int noches = leer.nextInt();
                System.out.println("ingrese el precio por noche ");
                float valorNoche = leer.nextFloat();

                float valorEstadia = noches * valorNoche;

                estadoHabitacion[i] = "X";

                clientes[i] = nombre;
                nochesReservadas[i] = noches;
                preciosPorNoche[i] = valorNoche;

                System.out.println("reserva hecha");
                System.out.println("Cliente: " + nombre + " total a pagar es de: " + valorEstadia);

                 }
                break;

            case 2:

                System.out.println("ingrese numero de habitacion que desea cancelar la reserva");
                int numeroCancelacion = leer.nextInt();

                int k = 6;

                if (numeroCancelacion == 101) {
                    k = 0; 
                    estadoHabitacion[k] = "libre";
                }
                if (numeroCancelacion == 102) {
                    k = 1; 
                    estadoHabitacion[k] = "libre";
                }
                if (numeroCancelacion == 103) {
                    k = 2; 
                    estadoHabitacion[k] = "libre";
                }
                if (numeroCancelacion == 104) {
                    k = 3; 
                    estadoHabitacion[k] = "libre";
                }
                if (numeroCancelacion == 105) {
                    k = 4; 
                    estadoHabitacion[k] = "libre";
                }
                if (numeroCancelacion == 106) {
                    k = 5; 
                    estadoHabitacion[k] = "libre";
                }

                if (k == 6) {
                    System.out.println("error, habitacion equivocada");
                    
                }
               
                break;
            case 3:
                System.out.println("informe de las habitaciones");
                int longitud = estadoHabitacion.length;
                for (int j = 0; j < longitud; j++) {
                    System.out.println("habitacion " + habitaciones[j] + " " + estadoHabitacion[j]);
                    
                }

                break;
            case 4:
                System.out.println("Saliendo del sistema de reservas");
        
            default:
                System.out.println("opcion invalida");
                break;
        }
        } while (opcion != 4 );
        
    }
}
