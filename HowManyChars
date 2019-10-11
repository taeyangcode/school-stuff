import java.util.Scanner;

public class HowManyChars {
    public HowManyChars() {
        Scanner sc = new Scanner (System.in);
        String askPhrase;
        char askChar;
        int charCounter = 0;
        System.out.println("Enter a phrase");
        askPhrase = sc.nextLine();
        System.out.println("Enter a letter");
        askChar = sc.next().charAt(0);
        
        for (int i = 0; i < askPhrase.length(); i++) {
            if (askPhrase.charAt(i) == askChar) {
                    charCounter = charCounter + 1;
            }
        }
        
        System.out.println("There are " + charCounter + " " + askChar + "'s in " + askPhrase);
    }
}
