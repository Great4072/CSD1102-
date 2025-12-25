import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int secretNumber = rand.nextInt(20) + 1; // สุ่มเลข 1-20
        int guess;
        int maxTries = 5;

        System.out.println("I am thinking of a number between 1 and 20.");
        System.out.println("Can you guess what it is?");

        for (int i = 1; i <= maxTries; i++) {
            System.out.print("> ");
            guess = sc.nextInt();

            if (guess < secretNumber) {
                System.out.println("Your guess is low. Try again?");
            } else if (guess > secretNumber) {
                System.out.println("Your guess is high. Try again?");
            } else {
                System.out.println("Correct! You guessed the number!");
                sc.close();
                return;
            }
        }

        System.out.println("Sorry, you have used all 5 tries.");
        System.out.println("The number was " + secretNumber);

        sc.close();
    }
}