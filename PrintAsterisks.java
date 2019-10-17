import java.util.Scanner;

public class PrintAsterisks {
 public PrintAsterisks() {
   Scanner sc = new Scanner(System.in);
   int input = 0;
   System.out.println("Enter a number!");
   input = sc.nextInt();
     for(int i = 0; i < input; i++) {
       System.out.print("*");
     }
 }
}
