package magazineprogram;

import java.util.ArrayList;

/**
 * @author Perry Fardella (33667316)
 * @descripton A class that extends Customer, has no additional functionality and was
 * purely created to help distinguish between Associate and Paying Customers.
 */
public class AssociateCustomer extends Customer {
    
    /**
     * @description Constructor with all variables
     * @param name
     * @param email
     * @param supplements
     */
    public AssociateCustomer(String name, String email, ArrayList<Supplement> supplements) {
        super(name, email, supplements);
    }

    /**
     * @description Constructor without supplements
     * @param name
     * @param email
     */
    public AssociateCustomer(String name, String email) {
        super(name, email);
    }   
    
}
