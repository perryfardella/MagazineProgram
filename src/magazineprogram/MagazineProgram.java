package magazineprogram;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Perry Fardella (33667316)
 * @description A class that has a main method that tests all functionality of the program
 * as specified in the assignment documentation.
 */
public class MagazineProgram {
    
    /**
     * 
     */
    public static void displayStudentDetails() {
        System.out.println("Student details");
        System.out.println("Name: Perry Fardella");
        System.out.println("Student Number: 33667316");
        System.out.println("Mode of enrolment: Internal");
        System.out.println("Tutor name: Ferdous Sohel");
        System.out.println("Tutorial day/time: Wednesday 13:30");
        System.out.println();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("TEST: displaying student details: ");
        displayStudentDetails();
        Supplement java = new Supplement("Java", "All the latest news and development around the language of Java", 1.95);
        Supplement javaScript = new Supplement("JavaScript", "All the latest news and development around the language of JavaScript", 2.05);
        Supplement c = new Supplement("C", "All the latest news and development around the language of C", 0.95);
        Supplement cSharp = new Supplement("C#", "All the latest news and development around the language of C#", 1.75);
        Supplement go = new Supplement("Go", "All the latest news and development around the language of Go", 1.55);
        Supplement jobsBoard = new Supplement("Jobs Board", "A listing of all the latest IT jobs available in the area", 3.75);

        ArrayList<Supplement> supplements = new ArrayList<>(Arrays.asList(java, javaScript, c, cSharp, go, jobsBoard));

        // A) construct a magazine with an array of 3-4 supplements with made-up details built in to the program - DONE
        Magazine theITTimes = new Magazine(
                "The IT Times",
                "A magazine for IT professionals",
                4.95,
                supplements
        );
        System.out.println("Instantiating a magazine...");
        System.out.println("TEST: does the magazine exist? " + (theITTimes instanceof Magazine) + "\n");

        AssociateCustomer julianHargreaves = new AssociateCustomer("Julian Hargreaves", "jHargreaves@live.com", new ArrayList<>(Arrays.asList(java, jobsBoard)));

        AssociateCustomer mikeRivers = new AssociateCustomer("Mike Rivers", "mikeyRiv@gmail.com", new ArrayList<>(Arrays.asList(c, go)));

        AssociateCustomer lauraAhmed = new AssociateCustomer("Laura Ahmed", "lauraA@gmail.com");

        PayingCustomer johnWinters = new PayingCustomer("John Winters", "jWi@hotmail.com", new ArrayList<>(Arrays.asList(jobsBoard, cSharp)), "Credit Card", new ArrayList<>(Arrays.asList(julianHargreaves, mikeRivers, lauraAhmed)));

        PayingCustomer michelleTrunket = new PayingCustomer("Michelle Trunket", "mTrunk@orionMail.com", "Direct Debit");

        PayingCustomer hunterRedford = new PayingCustomer("Hunter Redford", "hred@live.com", new ArrayList<>(Arrays.asList(jobsBoard, javaScript, cSharp)), "Bank Transfer");

        // B) construct an array of 5-6 different customers of various types with made-up details built in to the program - DONE
        ArrayList<Customer> customers = new ArrayList<Customer>() {
            {
                add(julianHargreaves);
                add(mikeRivers);
                add(lauraAhmed);
                add(johnWinters);
                add(michelleTrunket);
                add(hunterRedford);
            }
        };

        theITTimes.customers = customers;
        
        System.out.println("Adding customers to the Magazine...");
        System.out.println("TEST: list the customers: ");
        
        for (Customer customer: theITTimes.customers){
            System.out.println(customer.name);
        }
        System.out.println();

        // C) print out the text of all the emails for all customers for four weeks of magazines - DONE
        System.out.println("TEST: Printing out the text of all the emails for all customers for four weeks of magazines");
        for (int i = 0; i < 4; i++) {
            System.out.println("Week : " + (i + 1));
            for (Customer customer : theITTimes.getCustomers()) {
                customer.printWeeklyEmail();
            }
        }
        for (int i=0; i < theITTimes.getCustomers().size(); i++ )  {
            if (theITTimes.getCustomers().get(i) instanceof PayingCustomer) {
                ((PayingCustomer) theITTimes.getCustomers().get(i)).printMonthlyEmail(theITTimes.getWeeklyCost());
            }
        }

        // D) print out the text for the end of month emails for the paying customers - DONE
        System.out.println("TEST: Printing out the text for the end of month emails for the paying customers");
        for (int i=0; i < theITTimes.getCustomers().size(); i++ )  {
            if (theITTimes.getCustomers().get(i) instanceof PayingCustomer) {
                ((PayingCustomer) theITTimes.getCustomers().get(i)).printMonthlyEmail(theITTimes.getWeeklyCost());
            }
        }

        // E) add a new customer to the magazine service - DONE
        System.out.println("Test: Adding Trent Herring to the magazine service");
        theITTimes.customers.add(new PayingCustomer("Trent Herring", "tHerr@orionMail.com", "Direct Debit"));

        // F) remove an existing customer from the magazine service - DONE
        System.out.println("Test: Removing Michelle Trunket from the magazine service");
        theITTimes.customers.remove(4);
        System.out.println("Displaying customers to make sure that Trent has been added and Michelle has been removed: ");
        for (Customer customer: theITTimes.customers){
            System.out.println(customer.name);
        }
        System.out.println();

    }
}
