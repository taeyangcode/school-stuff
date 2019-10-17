import java.util.Scanner;

public class DigitAdder {
    public DigitAdder() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;
        num = sc.nextInt();
        while(num < 100 && num > 0) {
            num = sc.nextInt();
            sum = sum + num;
            System.out.println("The sum is " + sum);
        }
    }
}
