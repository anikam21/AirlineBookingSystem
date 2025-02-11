package flightbooking;

/**
 * The Passenger class represents a passenger with a name and age.
 * This class is abstract and requires subclasses to implement the applyDiscount and toString methods.
 */
public abstract class Passenger {
    private String name; // Name of the passenger
    private int age; // Age of the passenger
    
    /**
     * Constructs a Passenger with the specified name and age.
     *
     * @param name the name of the passenger
     * @param age the age of the passenger
     */
    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Gets the name of the passenger.
     * @return the name of the passenger
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the age of the passenger.
     * @return the age of the passenger
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the name of the passenger.
     * @param name the new name of the passenger
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the age of the passenger.
     * @param age the new age of the passenger
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Abstract method to apply a discount to a given price.
     * Subclasses must provide an implementation of this method.
     *
     * @param p the original price
     * @return the discounted price
     */
    public abstract double applyDiscount(double p);

    /**
     * Abstract method to return a string representation of the passenger.
     * Subclasses must provide an implementation of this method.
     *
     * @return a string representation of the passenger
     */
    @Override 
    public abstract String toString();
}
