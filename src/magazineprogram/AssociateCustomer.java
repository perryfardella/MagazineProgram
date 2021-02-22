package magazineprogram;

import java.util.ArrayList;

/**
 *
 * @author Perry Fardella (33667316)
 */
public class AssociateCustomer extends Customer {
    
    public AssociateCustomer(String name, String email, ArrayList<Supplement> supplements) {
        super(name, email, supplements);
    }

    public AssociateCustomer(String name, String email) {
        super(name, email);
    }   
    
}
