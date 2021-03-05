package magazineprogram;
import java.util.ArrayList;

/**
 * @filename Magazine.java
 * @author Perry Fardella (33667316)
 * @description A class that provides all the basic variables and functionality required
 * to instantiate and modify a magazine.
 * @date 04/03/2021
 */
public class Magazine {

    /**
     * @description A String containing the magazine's name
     */
    protected String name;

    /**
     * @description A String containing the magazine's description
     */
    protected String description;

    /**
     * @description A double specifying the magazine's weekly cost
     */
    protected double weeklyCost;

    /**
     * @description An ArrayList of all supplements available with the magazine
     */
    protected ArrayList<Supplement> supplements;

    /**
     * @description An ArrayList of all customers subscribed to the magazine
     */
    protected ArrayList<Customer> customers;
    
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
