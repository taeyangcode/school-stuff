import java.util.Scanner;

public class DaysInTheMonth {
    public DaysInTheMonth() {
        Scanner sc = new Scanner(System.in);
        String monthInput;
        
        System.out.println("Enter a name of a month");
        monthInput = sc.next().toLowerCase();
        
        switch(monthInput) {
            case "january":
                System.out.println("It has 31 days");
                break;
            case "february":
                System.out.println("It has 29 days");
                break;
            case "march":
                System.out.println("It has 31 days");
                break;
            case "april":
                System.out.println("It has 30 days");
                break;
            case "may":
                System.out.println("It has 31 days");
                break;
            case "june":
                System.out.println("It has 30 days");
                break;
            case "july":
                System.out.println("It has 31 days");
                break;
            case "august":
                System.out.println("It has 31 days");
                break;
            case "september":
                System.out.println("It has 30 days");
                break;
            case "october":
                System.out.println("It has 31 days");
                break;
