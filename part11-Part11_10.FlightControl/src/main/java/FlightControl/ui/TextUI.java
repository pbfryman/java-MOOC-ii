/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

/**
 *
 * @author Blake
 */
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

public class TextUI {
    private FlightControl control;
    private Scanner scanner;
    
    public TextUI(FlightControl control, Scanner scanner) {
        this.control = control;
        this.scanner = scanner;
    }
    
    public void start() {
        startAssetControl();
        startFlightControl();
    }
    
    private void startAssetControl() {
        System.out.println("AIRPORT ASSET CONTROL\n"
                + "---------------------");
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[X] Exit Airport Asset Control");
            System.out.print(">");
            String input = scanner.nextLine();
            if (input.toLowerCase().equals("x")) {
                break;
            }
            int choice = Integer.valueOf(input);
            switch (choice) {
                case 1:
                    System.out.print("Airplane ID: ");
                    String ID = scanner.nextLine();
                    System.out.print("Airplane Capacity: ");
                    int capacity = Integer.valueOf(scanner.nextLine());
                    control.addAirplane(ID, capacity);
                    break;
                case 2:
                    System.out.print("Airplane ID: ");
                    ID = scanner.nextLine();
                    System.out.print("Departure Airport: ");
                    String departure = scanner.nextLine();
                    System.out.print("Destination Airport: ");
                    String destination = scanner.nextLine();
                    control.addFlight(control.getAirplane(ID), departure, destination);
                    break;
            }
        }
    }
    
    private void startFlightControl() {
        System.out.println("FLIGHT CONTROL\n" +
                "---------------------");
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print Airplanes");
            System.out.println("[2] Print Flights");
            System.out.println("[3] Print Airplane Details");
            System.out.println("[X] Quit");
            System.out.print(">");
            String input = scanner.nextLine();
            if (input.toLowerCase().equals("x")) {
                break;
            }
            int choice = Integer.valueOf(input);
            switch (choice) {
                case 1:
                    for (Airplane plane : control.getAirplanes()) {
                        System.out.println(plane);
                    }
                    break;
                case 2:
                    for (Flight flight : control.getFlights()) {
                        System.out.println(flight);
                    }
                    break;
                case 3:
                    System.out.print("Airplane ID: ");
                    String ID = scanner.nextLine();
                    System.out.println(control.getAirplane(ID));
            }
        }
    }
}
