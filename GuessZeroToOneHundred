import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public NumberGuess() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randNum = 0;
        int x = 1;
        int guessNum;
        
        System.out.println("Guess a number from 0 to 100.");
        
        do {
            randNum = rand.nextInt(100);
            guessNum = sc.nextInt();
            if(guessNum == randNum) {
                System.out.println("You have got it right!");
                x = 1;
            }
            else if(guessNum < 1 || guessNum > 100) {
                System.out.println("You have got it wrong.");
                System.out.println("Please a number between 1 to 100.");
                x = 0;
            }
            else {
                System.out.println("You have got it wrong.");
                if(guessNum > randNum) {
                    System.out.println("Your number is too high!");
                }
                if(guessNum < randNum) {
                    System.out.println("Your number is too low!");
                }
                System.out.println("Try again.");
                x = 0;
            }
        } while(x == 0);
    }
}
