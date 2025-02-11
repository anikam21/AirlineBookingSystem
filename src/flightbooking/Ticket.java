package flightbooking;

/**
 * The Ticket class represents a ticket for a passenger on a specific flight.
 * Each ticket has a unique ticket number, a passenger, a flight, and a price.
 */
public class Ticket {
    private Passenger passenger; // The passenger who owns the ticket
    private Flight flight; // The flight associated with the ticket
    private double price; // The price of the ticket
    private final int ticketNumber; // The unique ticket number
    private static int numTickets = 0; // Static counter to generate unique ticket numbers

    /**
     * Constructs a Ticket with the specified passenger, flight, and price.
     * Automatically assigns a unique ticket number.
     *
     * @param p the passenger
     * @param flight the flight
     * @param price the price of the ticket
     */
    public Ticket(Passenger p, Flight flight, double price) {
        this.passenger = p;
        this.flight = flight;
        this.price = price;
        this.ticketNumber = ++Ticket.numTickets; // Assign a unique ticket number
    }

    /**
     * Gets the passenger who owns the ticket.
     * @return the passenger
     */
    public Passenger getPassenger() {
        return passenger;
    }

    /**
     * Gets the flight associated with the ticket.
     * @return the flight
     */
    public Flight getFlight() {
        return flight;
    }

    /**
     * Gets the price of the ticket.
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gets the unique ticket number.
     * @return the ticket number
     */
    public int getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the passenger who owns the ticket.
     * @param passenger the new passenger
     */
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    /**
     * Sets the flight associated with the ticket.
     * @param flight the new flight
     */
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    /**
     * Sets the price of the ticket.
     * @param price the new price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Returns a string representation of the ticket.
     *
     * @return a string representation of the ticket
     */
    @Override
    public String toString() {
        return String.format("Ticket #%d: Passenger: %s, Flight %d, %s to %s, %s, Original Price: $%.2f, Final Price: $%.2f",
                this.ticketNumber, this.passenger.getName(), this.flight.getFlightNumber(), 
                this.flight.getOrigin(), this.flight.getDestination(), this.flight.getDepartureTime(), 
                this.flight.getOriginalPrice(), this.price);
    }
}
