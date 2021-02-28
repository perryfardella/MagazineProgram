package magazineprogram;

/**
 *
 * @author Perry
 */
public class Supplement {

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
     * @param name
     * @param description
     * @param weeklyCost
     */
    public Supplement(String name, String description, double weeklyCost) {
        this.name = name;
        this.description = description;
        this.weeklyCost = weeklyCost;
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
    
}
