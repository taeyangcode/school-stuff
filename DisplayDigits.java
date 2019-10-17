import java.util.Scanner;

public class DisplayDigits {
    Scanner kb;
    public DisplayDigits() {
        kb = new Scanner(System.in);
        
        System.out.println("Enter a positive number, and press enter");
        int num = kb.nextInt();
        
        System.out.println("The number is " + num);
        System.out.println("\tDigit\tNumber");
        
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            System.out.print("\t" + digit);
            
            num = num / 10;
            System.out.println("\t" + num);
        }
        System.out.println("end of number list");
        System.out.println(sum);
    }
    
}
