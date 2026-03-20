package view;

import java.util.Scanner;
import service.VehiculoService;
import service.PersonaService;
import service.TicketService;

public class MenuView {

    private Scanner sc = new Scanner(System.in);

    // 🔥 conexiones con la capa service
    private VehiculoService vehiculoService = new VehiculoService();
    private PersonaService personaService = new PersonaService();
    private TicketService ticketService = new TicketService();

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
        vehiculoService.registrarVehiculo();
    }

    private void registrarPasajero() {
        personaService.registrarPasajero();
    }

    private void registrarConductor() {
        personaService.registrarConductor();
    }

    private void venderTicket() {
        ticketService.venderTicket();
    }

    private void mostrarReportes() {
        ticketService.mostrarReportes();
    }
}
