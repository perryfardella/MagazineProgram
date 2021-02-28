package magazineprogram;
import java.util.ArrayList;

/**
 *
 * @author Perry
 */
public class Magazine {

    /**
     *
     */
    protected String name;

    /**
     *
     */
    protected String description;

    /**
     *
     */
    protected double weeklyCost;

    /**
     *
     */
    protected ArrayList<Supplement> supplements;

    /**
     *
     */
    protected ArrayList<Customer> customers;
    
    // Need to give Magazine an ArrayList of customers
    
    /**
     *
     * @param name
     * @param description
     * @param weeklyCost
     * @param supplements
     * @param customers
     */
        
    public Magazine(String name, String description, double weeklyCost, ArrayList<Supplement> supplements, ArrayList<Customer> customers) {
        this.name = name;
        this.description = description;
        this.weeklyCost = weeklyCost;
        this.supplements = supplements;
        this.customers = customers;
    }
    
    /**
     *
     * @param name
     * @param description
     * @param weeklyCost
     * @param supplements
     */
    public Magazine(String name, String description, double weeklyCost, ArrayList<Supplement> supplements) {
        this.name = name;
        this.description = description;
        this.weeklyCost = weeklyCost;
        this.supplements = supplements;
        this.customers = new ArrayList<Customer>();
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public double getWeeklyCost() {
        return weeklyCost;
    }

    /**
     *
     * @param weeklyCost
     */
    public void setWeeklyCost(double weeklyCost) {
        this.weeklyCost = weeklyCost;
    }

    /**
     *
     * @return
     */
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    /**
     *
     * @param customers
     */
    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    /**
     *
     * @return
     */
    public ArrayList<Supplement> getSupplements() {
        return supplements;
    }

    /**
     *
     * @param supplements
     */
    public void setSupplements(ArrayList<Supplement> supplements) {
        this.supplements = supplements;
    }
    
}
