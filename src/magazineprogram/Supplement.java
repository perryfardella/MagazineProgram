package magazineprogram;

/**
 *
 * @author Perry
 */
public class Supplement {
    protected String name;
    protected String description;
    protected double weeklyCost;
    
    Supplement(String name, String description, double weeklyCost) {
        this.name = name;
        this.description = description;
        this.weeklyCost = weeklyCost;
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
    
}
