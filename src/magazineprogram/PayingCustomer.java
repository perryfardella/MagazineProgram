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
    }
    
    public PayingCustomer(String name, String email, String paymentMethod,ArrayList<AssociateCustomer> associateCustomers) {
        super(name, email);
        this.paymentMethod = paymentMethod;
        this.associateCustomers = associateCustomers;
    }

    public PayingCustomer(String name, String email,String paymentMethod) {
        super(name, email);
        this.paymentMethod = paymentMethod;
    }
    

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    public void printMonthlyEmail() {
        System.out.println("insert email message here");
    }
    
}
