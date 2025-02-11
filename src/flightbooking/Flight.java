package flightbooking;

/**
 * Represents a flight with details such as flight number, origin, destination, departure time, capacity, and price.
 * Provides methods to get and set these details, book a seat, and return a string representation of the flight.
 * 
 */
public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;

    /**
     * Constructs a Flight with the specified details.
     *
     * @param flightNumber   the flight number
     * @param origin         the origin of the flight
     * @param destination    the destination of the flight
     * @param departureTime  the departure time of the flight
     * @param capacity       the capacity of the flight
     * @param originalPrice  the original price of the flight
     * @throws IllegalArgumentException if origin and destination are the same
     */
    public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice) {
        if (origin.equals(destination)) {
            throw new IllegalArgumentException("Origin and destination must be different.");
        }
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.numberOfSeatsLeft = capacity;
        this.originalPrice = originalPrice;
    }

    // Getter methods

    public int getFlightNumber() {
        return this.flightNumber;
    }

    public String getOrigin() {
        return this.origin;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getNumberOfSeatsLeft() {
        return this.numberOfSeatsLeft;
    }

    public double getOriginalPrice() {
        return this.originalPrice;
    }

    // Setter methods

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setNumberOfSeatsLeft(int numberOfSeatsLeft) {
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Books a seat on the flight if available.
     *
     * @return true if a seat was booked, false otherwise
     */
    public boolean bookASeat() {
        if (this.numberOfSeatsLeft > 0) {
            this.numberOfSeatsLeft--;
            return true;
        }
        return false;
    }

    /**
     * Returns a string representation of the flight.
     *
     * @return a string representation of the flight
     */
    @Override
    public String toString() {
        return String.format("Flight %d, %s to %s, %s, original price: $%.2f",
                this.flightNumber, this.origin, this.destination, this.departureTime, this.originalPrice);
    }
}
