package flightbooking;

/**
 * The Member class represents a frequent flyer member.
 * This class extends the Passenger class and overrides the applyDiscount method.
 * A Member object has a yearsOfMembership attribute and receives discounts based on the length of membership.
 */
public class Member extends Passenger {
    private int yearsOfMembership; // Number of years the member has been part of the frequent flyer program

    /**
     * Constructs a Member with the specified name, age, and years of membership.
     *
     * @param name the name of the member
     * @param age the age of the member
     * @param yearsOfMembership the number of years of membership
     */
    public Member(String name, int age, int yearsOfMembership) {
        super(name, age); // Call the constructor of the superclass Passenger
        this.yearsOfMembership = yearsOfMembership;
    }

    /**
     * Gets the number of years of membership.
     * @return the number of years of membership
     */
    public int getYearsOfMembership() {
        return yearsOfMembership;
    }

    /**
     * Sets the number of years of membership.
     * @param yearsOfMembership the new number of years of membership
     */
    public void setYearsOfMembership(int yearsOfMembership) {
        this.yearsOfMembership = yearsOfMembership;
    }

    /**
     * Applies a discount based on the number of years of membership.
     * If the member has been part of the program for more than 5 years, they receive a 50% discount.
     * If the member has been part of the program for more than 1 year but less than or equal to 5 years, they receive a 10% discount.
     * Otherwise, no discount is applied.
     *
     * @param p the original price
     * @return the discounted price
     */
    @Override
    public double applyDiscount(double p) {
        if (this.yearsOfMembership > 5) {
            return p * 0.5; // 50% discount
        } else if (this.yearsOfMembership > 1) {
            return p * 0.9; // 10% discount
        } else {
            return p; // No discount
        }
    }

    /**
     * Returns a string representation of the member.
     *
     * @return a string representation of the member
     */
    @Override
    public String toString() {
        return String.format("Member Info: Name: %s, Age: %d, Years of Membership: %d", this.getName(), this.getAge(), this.yearsOfMembership);
    }
}
