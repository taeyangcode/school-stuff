import java.util.Scanner;

public class SumAverageMinMax {
    public SumAverageMinMax() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int prevNumber = 0;
        int num = 0;
        int minimum = 0;
        int maximum = 0;
        
        for(int i = 1; i <= 10; i++) {
            System.out.println("Enter number " + i);
            num = sc.nextInt();//6
            if(num < prevNumber) {
                minimum = num;
            }
            else if(num > prevNumber) {
                maximum = num;
            }
            else {
                
            }
            prevNumber = num;//5
            sum = sum + num;
        }
        System.out.println("The average of the numbers " + (sum / 10));
        System.out.println("The sum of the numbers is " + sum);
        System.out.println("The highest number is " + maximum);
        System.out.println("The smallest number is " + minimum);
    }
}
