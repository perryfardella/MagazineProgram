package magazineprogram;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Perry Fardella (33667316)
 */
public class MagazineProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Supplement java = new Supplement("Java", "All the latest news and development around the language of Java", 1.95);
        Supplement javaScript = new Supplement("JavaScript", "All the latest news and development around the language of JavaScript", 2.05);
        Supplement c = new Supplement("C", "All the latest news and development around the language of C", 0.95);
        Supplement cSharp = new Supplement("C#", "All the latest news and development around the language of C#", 1.75);
        Supplement go = new Supplement("Go", "All the latest news and development around the language of Go", 1.55);
        Supplement jobsBoard = new Supplement("Jobs Board", "A listing of all the latest IT jobs available in the area", 3.75);
        
        ArrayList<Supplement> supplements = new ArrayList<>(Arrays.asList(java, javaScript, c, cSharp, go, jobsBoard));
        supplements.add(java);
        
        Magazine theITTimes = new Magazine(
                "The IT Times", 
                "A magazine for IT professionals", 
                4.95,
                supplements
        );
    }
    
}
