import java.util.Scanner;

public class EvenOrOdd {
    Scanner sc;
    int num;
    public EvenOrOdd() {
        sc = new Scanner(System.in);
        System.out.println("Type in a number to see if it's odd or even.");
        num = sc.nextInt();
        
        if(num % 2 == 0) {
            System.out.println("The number is even");
        }
        else if(num % 2 == 1) {
            System.out.println("The number is odd");
        }
        
    }
}
