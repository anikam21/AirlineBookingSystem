package flightbooking;

/**
 * The NonMember class represents a passenger who is not a frequent flyer member.
 * This class extends the Passenger class and overrides the applyDiscount method.
 * If the age of the person is more than 65, a 10% discount will be applied. Otherwise, no discount.
 */
public class NonMember extends Passenger {
    
    /**
     * Constructs a NonMember with the specified name and age.
     *
     * @param name the name of the non-member
     * @param age the age of the non-member
     */
    public NonMember(String name, int age) {
        super(name, age);
    }

    /**
     * Applies a discount based on the age of the passenger.
     * If the age of the person is more than 65, a 10% discount will be applied.
     * Otherwise, no discount is applied.
     *
     * @param p the original price
     * @return the discounted price
     */
    @Override
    public double applyDiscount(double p) {
        return (this.getAge() > 65) ? p * 0.9 : p; // 10% discount if age > 65
    }

    /**
     * Returns a string representation of the non-member.
     *
     * @return a string representation of the non-member
     */
    @Override
    public String toString() {
        return String.format("Non Member: Name: %s, Age: %d", this.getName(), this.getAge());
    }
}
