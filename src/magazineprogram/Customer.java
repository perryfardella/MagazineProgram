package magazineprogram;

import java.util.ArrayList;

/**
 * @filename Customer.java
 * @author Perry Fardella (33667316)
 * @description A class to provide the functionality and variables needed to instantiate a
 * basic magazine customer.
 * @date 04/03/2021
 */
public class Customer {

    /**
     * @description A variable to hold the customer's name, of type String
     */
    protected String name;

    /**
     * @description A variable to hold the customer's email, of type String
     */
    protected String email;

    /**
     * @description A variable to hold the customer's magazine supplements they are subscribed to
     */
    protected ArrayList<Supplement> supplements;

    /**
     * @description A constructor to initialize all variables
     * @param name
     * @param email
     * @param supplements
     */
        public Customer(String name, String email, ArrayList<Supplement> supplements) {
        this.name = name;
        this.email = email;
        this.supplements = supplements;
    }

    // Constructor for customers without any magazine supplements

    /**
     * @description A constructor to initialize all variables except supplements
     * @param name
     * @param email
     */
        public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.supplements = new ArrayList<Supplement>();
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public ArrayList<Supplement> getSupplements() {
        return supplements;
    }

    /**
     *
     * @param supplements
     */
    public void setSupplements(ArrayList<Supplement> supplements) {
        this.supplements = supplements;
    }

    /**
     * @description A method to print the customers weekly email, telling them that
     * the latest issue of the magazine and the customers supplements is ready for view.
     * The email also lists all the supplements a customer is subscribed to.
     */
    public void printWeeklyEmail() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Hi, " + getName());
        System.out.println("Your magazine is ready to look at!");

        if (!getSupplements().isEmpty()) {
            System.out.println("The supplements you are currently subscribed to are:");
            for (Supplement supplement : getSupplements()) {
                System.out.println("-" + supplement.getName());
            }
        } else {
            System.out.println("You are not subscribed to any additional supplements.");
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
    }

    /**
     *
     */
    public void printSupplementMonthlyFees() {
        for (Supplement supplement : getSupplements()) {
            System.out.println(" -" + supplement.getName() + " ($" + supplement.getWeeklyCost() + " * 4weeks = $" + supplement.getWeeklyCost() * 4 + ")");
        }
    }

    /**
     *
     * @return
     */
    public double sumMonthlySupplementFees() {
        double totalSupplementFees = 0;
        if (!getSupplements().isEmpty()) {
            for (Supplement supplement : getSupplements()) {
                totalSupplementFees += supplement.getWeeklyCost();
            }
        }

        return totalSupplementFees * 4;
    }

}
