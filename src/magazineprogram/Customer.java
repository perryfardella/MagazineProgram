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
        System.out.println("insert email message here");
    }
    
}
