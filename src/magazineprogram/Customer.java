package magazineprogram;

/**
 *
 * @author Perry Fardella (33667316)
 */
public class Customer {
    protected String name;
    protected String email;
    protected Supplement[] supplements;
    
    Customer(String name, String email, Supplement[] supplements) {
        this.name = name;
        this.email = email;
        this.supplements = supplements;
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

    public Supplement[] getSupplements() {
        return supplements;
    }

    public void setSupplements(Supplement[] supplements) {
        this.supplements = supplements;
    }
    
    public void printWeeklyEmail() {
        System.out.println("insert email message here");
    }
    
}
