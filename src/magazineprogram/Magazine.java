package magazineprogram;

/**
 *
 * @author Perry
 */
public class Magazine {
    protected String name;
    protected double weeklyCost;
    //Does a magazine have attached supplements?
    protected Supplement[] supplements;
    
    Magazine(String name, double weeklyCost, Supplement[] supplements) {
        this.name = name;
        this.weeklyCost = weeklyCost;
        this. supplements = supplements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeeklyCost() {
        return weeklyCost;
    }

    public void setWeeklyCost(double weeklyCost) {
        this.weeklyCost = weeklyCost;
    }

    public Supplement[] getSupplements() {
        return supplements;
    }

    public void setSupplements(Supplement[] supplements) {
        this.supplements = supplements;
    }
    
    
}
