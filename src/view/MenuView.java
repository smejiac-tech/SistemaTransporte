package view;

import java.util.Scanner;

public class MenuView {

    private Scanner sc = new Scanner(System.in);

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("\n=== SISTEMA TRANS CESAR ===");
            System.out.println("1. Registrar vehículo");
            System.out.println("2. Registrar pasajero");
            System.out.println("3. Registrar conductor");
            System.out.println("4. Vender ticket");
            System.out.println("5. Ver reportes");
            System.out.println("0. Salir");
            System.out.print("Seleccione: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    registrarVehiculo();
                    break;
                case 2:
                    registrarPasajero();
                    break;
                case 3:
                    registrarConductor();
                    break;
                case 4:
                    venderTicket();
                    break;
                case 5:
                    mostrarReportes();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);
    }

    private void registrarVehiculo() {
        System.out.println("Función en construcción...");
    }

    private void registrarPasajero() {
        System.out.println("Función en construcción...");
    }

    private void registrarConductor() {
        System.out.println("Función en construcción...");
    }

    private void venderTicket() {
        System.out.println("Función en construcción...");
    }

    private void mostrarReportes() {
        System.out.println("Función en construcción...");
    }
}
