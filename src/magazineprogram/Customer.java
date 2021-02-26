package magazineprogram;

import java.util.ArrayList;

/**
 *
 * @author Perry Fardella (33667316)
 */
public class Customer {

    protected String name;
    protected String email;
    protected ArrayList<Supplement> supplements;

    // Constructor instantiating all variables
    public Customer(String name, String email, ArrayList<Supplement> supplements) {
        this.name = name;
        this.email = email;
        this.supplements = supplements;
    }

    // Constructor for customers without any magazine supplements
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.supplements = new ArrayList<Supplement>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Supplement> getSupplements() {
        return supplements;
    }

    public void setSupplements(ArrayList<Supplement> supplements) {
        this.supplements = supplements;
    }

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

    public void printSupplementMonthlyFees() {
        for (Supplement supplement : getSupplements()) {
            System.out.println(" -" + supplement.getName() + " ($" + supplement.getWeeklyCost() + " * 4weeks = $" + supplement.getWeeklyCost()*4 + ")");
        }
    }

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
