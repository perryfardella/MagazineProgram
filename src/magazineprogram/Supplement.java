package magazineprogram;

/**
 *
 * @author Perry
 */
public class Supplement {
    protected String name;
    protected double weeklyCost;
    
    Supplement(String name, double weeklyCost) {
        this.name = name;
        this.weeklyCost = weeklyCost;
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
    
    
}
