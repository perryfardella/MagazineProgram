package magazineprogram;

import java.util.ArrayList;

/**
 * @author Perry Fardella (33667316)
 * @descripton A class that extends Customer and provides additional variables and methods
 * required for paying customers.
 */
public class PayingCustomer extends Customer {
    //Make this an enum? Declare a seperate enum class for payment methods?

    /**
     * @description A String that records the customers preferred payment method
     */
        protected String paymentMethod;

    /**
     * @description An ArrayList of all the associated customers the paying customer
     * pays for
     */
    protected ArrayList<AssociateCustomer> associateCustomers;
    
    /**
     *
     * @param name
     * @param email
     * @param supplements
     * @param paymentMethod
     * @param associateCustomers
     */
    public PayingCustomer(String name, String email, ArrayList<Supplement> supplements, String paymentMethod, ArrayList<AssociateCustomer> associateCustomers) {
        super(name, email, supplements);
        this.paymentMethod = paymentMethod;
        this.associateCustomers = associateCustomers;
    }

    /**
     *
     * @param name
     * @param email
     * @param supplements
     * @param paymentMethod
     */
    public PayingCustomer(String name, String email, ArrayList<Supplement> supplements, String paymentMethod) {
        super(name, email, supplements);
        this.paymentMethod = paymentMethod;
        this.associateCustomers = new ArrayList<AssociateCustomer>();
    }
    
    /**
     *
     * @param name
     * @param email
     * @param paymentMethod
     * @param associateCustomers
     */
    public PayingCustomer(String name, String email, String paymentMethod,ArrayList<AssociateCustomer> associateCustomers) {
        super(name, email);
        this.paymentMethod = paymentMethod;
        this.associateCustomers = associateCustomers;
    }

    /**
     *
     * @param name
     * @param email
     * @param paymentMethod
     */
    public PayingCustomer(String name, String email,String paymentMethod) {
        super(name, email);
        this.paymentMethod = paymentMethod;
        this.associateCustomers = new ArrayList<AssociateCustomer>();
    }

    /**
     *
     * @return
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     *
     * @param paymentMethod
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     *
     * @return
     */
    public ArrayList<AssociateCustomer> getAssociateCustomers() {
        return associateCustomers;
    }

    /**
     *
     * @param associateCustomers
     */
    public void setAssociateCustomers(ArrayList<AssociateCustomer> associateCustomers) {
        this.associateCustomers = associateCustomers;
    }
    
    /**
     * @description A method that prints the monthly email all paying customers receive,
     * stating the total fee being charged to their account as well as a breakdown of where
     * the fees are coming from
     * @param weeklyMagazineCost
     */
    public void printMonthlyEmail(double weeklyMagazineCost) {
        double totalFees = 0;
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Hi, " + getName());
        System.out.println("Please see a breakdown of your fees below:");
        
        System.out.println("\n" + getName() + ":");
        System.out.println(" -Core magazine subscription ($" + weeklyMagazineCost + " * 4weeks = $" + weeklyMagazineCost * 4 + ")");
        printSupplementMonthlyFees();
        System.out.println(getName() + " total fees for the month is: $" + (weeklyMagazineCost * 4 + sumMonthlySupplementFees()));
        totalFees += weeklyMagazineCost * 4 + sumMonthlySupplementFees();
        System.out.println();
        
        for(AssociateCustomer associateCustomer : getAssociateCustomers()) {
            System.out.println(associateCustomer.getName());
            System.out.println(" -Core magazine subscription ($" + weeklyMagazineCost + " * 4weeks = $" + weeklyMagazineCost * 4 + ")");
            associateCustomer.printSupplementMonthlyFees();
            System.out.println(associateCustomer.getName() + " total fees for the month is: $" + (weeklyMagazineCost * 4 + associateCustomer.sumMonthlySupplementFees()));
            totalFees +=  weeklyMagazineCost * 4 + associateCustomer.sumMonthlySupplementFees();
            System.out.println();
        }
        System.out.println("The total amount charged to your account this month is: $" + totalFees);
        
        System.out.println("----------------------------------------------------------------------------");
    }
    
}
