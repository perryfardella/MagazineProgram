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
    
}
