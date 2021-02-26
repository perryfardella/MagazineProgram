package magazineprogram;

import java.util.ArrayList;

/**
 *
 * @author Perry Fardella (33667316)
 */
public class PayingCustomer extends Customer {
    //Make this an enum? Declare a seperate enum class for payment methods?
    protected String paymentMethod;
    protected ArrayList<AssociateCustomer> associateCustomers;
    
    public PayingCustomer(String name, String email, ArrayList<Supplement> supplements, String paymentMethod, ArrayList<AssociateCustomer> associateCustomers) {
        super(name, email, supplements);
        this.paymentMethod = paymentMethod;
        this.associateCustomers = associateCustomers;
    }

    public PayingCustomer(String name, String email, ArrayList<Supplement> supplements, String paymentMethod) {
        super(name, email, supplements);
        this.paymentMethod = paymentMethod;
        this.associateCustomers = new ArrayList<AssociateCustomer>();
    }
    
    public PayingCustomer(String name, String email, String paymentMethod,ArrayList<AssociateCustomer> associateCustomers) {
        super(name, email);
        this.paymentMethod = paymentMethod;
        this.associateCustomers = associateCustomers;
    }

    public PayingCustomer(String name, String email,String paymentMethod) {
        super(name, email);
        this.paymentMethod = paymentMethod;
        this.associateCustomers = new ArrayList<AssociateCustomer>();
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public ArrayList<AssociateCustomer> getAssociateCustomers() {
        return associateCustomers;
    }

    public void setAssociateCustomers(ArrayList<AssociateCustomer> associateCustomers) {
        this.associateCustomers = associateCustomers;
    }
    
    
    
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
        
        // For each customer sum their fees
//        for(Supplement supplement : getSupplements()) {
//            System.out.println("-" + supplement.getName());
//        }
    }
    
}
