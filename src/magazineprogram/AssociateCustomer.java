package magazineprogram;

import java.util.ArrayList;

/**
 *
 * @author Perry Fardella (33667316)
 */
public class AssociateCustomer extends Customer {
    
    /**
     *
     * @param name
     * @param email
     * @param supplements
     */
    public AssociateCustomer(String name, String email, ArrayList<Supplement> supplements) {
        super(name, email, supplements);
    }

    /**
     *
     * @param name
     * @param email
     */
    public AssociateCustomer(String name, String email) {
        super(name, email);
    }   
    
}
