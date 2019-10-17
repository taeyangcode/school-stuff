import java.util.Scanner;

public class BirthdayHomework {
    int dayBirth;
    String monthBirth;
    int yearBirth;
    
    Scanner bday;
    
    int i;
    public BirthdayHomework() {
        bday = new Scanner(System.in);
        
        System.out.println("What is your month of birth? What is your day of birth? What is your year of birth?");
        monthBirth = bday.next();
        dayBirth = bday.nextInt();
        yearBirth = bday.nextInt();
        
        System.out.println(monthBirth + " " + dayBirth + ", " + yearBirth);
        
    }

}
