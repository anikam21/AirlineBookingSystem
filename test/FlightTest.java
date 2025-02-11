package flightbooking;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the Flight class.
 * Ensures that the Flight class behaves as expected.
 */
public class FlightTest {
    private Flight flight;

    /**
     * Sets up a new Flight object before each test.
     */
    @Before
    public void setUp() {
        flight = new Flight(200, "New York", "Los Angeles", "08/15/2023 6:00 am", 20, 1500.5);
    }

    /**
     * Cleans up after each test.
     */
    @After
    public void tearDown() {
        flight = null;
    }

    /**
     * Test the constructor to ensure it initializes the Flight object correctly.
     */
    @Test
    public void testConstructor() {
        flight = new Flight(101, "Chicago", "Miami", "09/20/2023 9:30 am", 15, 1200.75);
        assertEquals(101, flight.getFlightNumber());
        assertEquals("Chicago", flight.getOrigin());
        assertEquals("Miami", flight.getDestination());
        assertEquals("09/20/2023 9:30 am", flight.getDepartureTime());
        assertEquals(15, flight.getCapacity());
        assertEquals(15, flight.getNumberOfSeatsLeft());
        assertEquals(1200.75, flight.getOriginalPrice(), 0.0);
    }

    /**
     * Test the constructor with invalid data.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidConstructor() {
        new Flight(102, "Boston", "Boston", "10/10/2023 10:00 am", 10, 800.0);
    }

    @Test
    public void testGetFlightNumber() {
        assertEquals(200, flight.getFlightNumber());
    }

    @Test
    public void testGetOrigin() {
        assertEquals("New York", flight.getOrigin());
    }

    @Test
    public void testGetDestination() {
        assertEquals("Los Angeles", flight.getDestination());
    }

    @Test
    public void testGetDepartureTime() {
        assertEquals("08/15/2023 6:00 am", flight.getDepartureTime());
    }

    @Test
    public void testGetCapacity() {
        assertEquals(20, flight.getCapacity());
    }

    @Test
    public void testGetNumberOfSeatsLeft() {
        assertEquals(20, flight.getNumberOfSeatsLeft());
    }

    @Test
    public void testGetOriginalPrice() {
        assertEquals(1500.5, flight.getOriginalPrice(), 0.0);
    }

    @Test
    public void testSetFlightNumber() {
        flight.setFlightNumber(300);
        assertEquals(300, flight.getFlightNumber());
    }

    @Test
    public void testSetOrigin() {
        flight.setOrigin("San Francisco");
        assertEquals("San Francisco", flight.getOrigin());
    }

    @Test
    public void testSetDestination() {
        flight.setDestination("Houston");
        assertEquals("Houston", flight.getDestination());
    }

    @Test
    public void testSetDepartureTime() {
        flight.setDepartureTime("11/15/2023 8:45 pm");
        assertEquals("11/15/2023 8:45 pm", flight.getDepartureTime());
    }

    @Test
    public void testSetCapacity() {
        flight.setCapacity(25);
        assertEquals(25, flight.getCapacity());
    }

    @Test
    public void testSetNumberOfSeatsLeft() {
        flight.setNumberOfSeatsLeft(18);
        assertEquals(18, flight.getNumberOfSeatsLeft());
    }

    @Test
    public void testSetOriginalPrice() {
        flight.setOriginalPrice(1300.0);
        assertEquals(1300.0, flight.getOriginalPrice(), 0.0);
    }

    @Test
    public void testBookASeat() {
        flight.setNumberOfSeatsLeft(1);
        assertTrue(flight.bookASeat());
        assertFalse(flight.bookASeat()); // Should fail since no seats are left
    }

    @Test
    public void testToString() {
        String expectedOutput = "Flight 200, New York to Los Angeles, 08/15/2023 6:00 am, original price: $1500.50";
        assertEquals(expectedOutput, flight.toString());
    }
}
