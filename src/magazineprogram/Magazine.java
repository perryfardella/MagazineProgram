package magazineprogram;
import java.util.ArrayList;

/**
 *
 * @author Perry
 */
public class Magazine {
    protected String name;
    protected String description;
    protected double weeklyCost;
    protected ArrayList<Supplement> supplements;
    protected ArrayList<Customer> customers;
    
    // Need to give Magazine an ArrayList of customers
    
    public Magazine(String name, String description, double weeklyCost, ArrayList<Supplement> supplements, ArrayList<Customer> customers) {
        this.name = name;
        this.description = description;
        this.weeklyCost = weeklyCost;
        this.supplements = supplements;
        this.customers = customers;
    }
    
    public Magazine(String name, String description, double weeklyCost, ArrayList<Supplement> supplements) {
        this.name = name;
        this.description = description;
        this.weeklyCost = weeklyCost;
        this.supplements = supplements;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeeklyCost() {
        return weeklyCost;
    }

    public void setWeeklyCost(double weeklyCost) {
        this.weeklyCost = weeklyCost;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Supplement> getSupplements() {
        return supplements;
    }

    public void setSupplements(ArrayList<Supplement> supplements) {
        this.supplements = supplements;
    }
    
}
