package magazineprogram;

/**
 *
 * @author Perry Fardella (33667316)
 */
public class PayingCustomer extends Customer {
    //Make this an enum? Declare a seperate enum class for payment methods?
    protected String paymentMethod;
    //protected AssociateCustomer[]
    
    PayingCustomer(String name, String email, Supplement[] supplements, String paymentMethod) {
        super(name, email, supplements);
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
