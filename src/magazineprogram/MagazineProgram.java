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
        
        // A) construct a magazine with an array of 3-4 supplements with made-up details built in to the progra,
        Magazine theITTimes = new Magazine(
                "The IT Times", 
                "A magazine for IT professionals", 
                4.95,
                supplements
        );
        
        ArrayList<Supplement> julianSupplements = new ArrayList<>(Arrays.asList(java, jobsBoard));
        AssociateCustomer julianHargreaves = new AssociateCustomer("Julian Hargreaves", "jHargreaves@live.com", julianSupplements);
        
        ArrayList<Supplement> mikeSupplements = new ArrayList<>(Arrays.asList(c, go));
        AssociateCustomer mikeRivers = new AssociateCustomer("Mike Rivers", "mikeyRiv@gmail.com", mikeSupplements);
        
        AssociateCustomer lauraAhmed = new AssociateCustomer("Laura Ahmed", "lauraA@gmail.com");
        
        ArrayList<AssociateCustomer> johnsEmployees = new ArrayList<>(Arrays.asList(julianHargreaves, mikeRivers, lauraAhmed));
        ArrayList<Supplement> johnSupplements = new ArrayList<>(Arrays.asList(jobsBoard, cSharp));
        
        PayingCustomer johnWinters = new PayingCustomer("John Winters", "jWi@hotmail.com", johnSupplements, "Credit Card", johnsEmployees );
        
        PayingCustomer michelleTrunket = new PayingCustomer("Michelle Trunket", "mTrunk@orionMail.com", "Direct Debit");
        
        ArrayList<Supplement> hunterSupplements = new ArrayList<>(Arrays.asList(jobsBoard, javaScript, cSharp));
        PayingCustomer hunterRedford = new PayingCustomer("Hunter Redford", "hred@live.com", hunterSupplements, "Bank Transfer");
        
        // B) construct an array of 5-6 different customers of various types with made-up details built in to the program
        Customer array[] = {julianHargreaves, mikeRivers, lauraAhmed, johnWinters, michelleTrunket, hunterRedford};
        
        // C) print out the text of all the emails for all customers for four weeks of magazines
        // D) print out the text for the end of month emails for the paying customers
        // E) add a new customer to the magazine service
       
        
        // F) remove an existing customer from the magazine service
        
            // Magazine needs to have an ArrayList of Customers
        
        // G) thoroughly test your program
    }
    
}
