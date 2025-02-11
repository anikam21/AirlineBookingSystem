package flightbooking;

import java.util.ArrayList;
import java.util.List;

/**
 * The Manager class manages flights and tickets for a flight booking system.
 * It can create flights, display available flights, book seats for passengers, and maintain a list of issued tickets.
 * 
 */
public class Manager {
    private Flight[] flights; // Array of flights managed by the manager
    private List<Ticket> tickets; // List of tickets issued by the manager

    /**
     * Constructs a Manager with an empty array of flights and an empty list of tickets.
     */
    public Manager() {
        this.flights = new Flight[5];
        this.tickets = new ArrayList<>();
    }

    /**
     * Creates a set of sample flights and adds them to the array of flights.
     */
    public void createFlights() {
        flights[0] = new Flight(2001, "New York", "Los Angeles", "08/15/2023 9:00 am", 5, 450.00);
        flights[1] = new Flight(2002, "Los Angeles", "New York", "08/20/2023 4:30 pm", 4, 420.00);
        flights[2] = new Flight(2003, "Chicago", "Houston", "09/10/2023 2:00 pm", 6, 300.00);
        flights[3] = new Flight(2004, "Miami", "Boston", "09/12/2023 5:00 pm", 7, 350.00);
        flights[4] = new Flight(2005, "Dallas", "San Francisco", "09/15/2023 1:00 pm", 8, 500.00);
    }

    /**
     * Displays available flights from the specified origin to the specified destination.
     *
     * @param origin the origin of the flight
     * @param destination the destination of the flight
     */
    public void displayAvailableFlights(String origin, String destination) {
        boolean foundAFlight = false;
        System.out.println("\nAvailable flights from " + origin + " to " + destination + ":");
        for (Flight flight : flights) {
            if (flight != null && flight.getOrigin().equals(origin) && flight.getDestination().equals(destination) && flight.getNumberOfSeatsLeft() > 0) {
                System.out.println(flight);
                foundAFlight = true;
            }
        }
        if (!foundAFlight) {
            System.out.println("No available flights from " + origin + " to " + destination + ".");
        }
    }

    /**
     * Gets the flight with the specified flight number.
     *
     * @param flightNumber the flight number
     * @return the Flight object with the specified flight number, or null if no such flight exists
     */
    public Flight getFlight(int flightNumber) {
        for (Flight flight : flights) {
            if (flight != null && flight.getFlightNumber() == flightNumber) {
                return flight;
            }
        }
        return null;
    }

    /**
     * Books a seat for the specified passenger on the flight with the specified flight number.
     *
     * @param flightNumber the flight number
     * @param p the passenger
     */
    public void bookSeat(int flightNumber, Passenger p) {
        System.out.println("\nAttempting to book: " + p.toString() + " on Flight " + flightNumber);
        Flight flight = this.getFlight(flightNumber);
        if (flight == null) {
            System.out.println("Error: Flight number " + flightNumber + " not found.");
            return;
        }
        if (flight.bookASeat()) {
            tickets.add(new Ticket(p, flight, p.applyDiscount(flight.getOriginalPrice())));
            System.out.println("Booking successful.");
        } else {
            System.out.println("Booking failed: No seats available on this flight.");
        }
    }

    /**
     * The main method to demonstrate flight booking.
     */
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.createFlights();
        manager.displayAvailableFlights("Chicago", "Houston");

        Passenger passenger = new Member("Alice", 22, 6);
        manager.bookSeat(2003, passenger);
    }
}
