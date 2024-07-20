import java.util.Random;
import java.util.Scanner;

public class task  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int roundsWon = 0;

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("Guess the number between 1 and 100:");

            while (!hasGuessedCorrectly && attempts < 10) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Correct! You've guessed the number!");
                    hasGuessedCorrectly = true;
                    roundsWon++;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }

                if (attempts == 10 && !hasGuessedCorrectly) {
                    System.out.println("Sorry! You've reached the maximum number of attempts. The correct number was " + numberToGuess);
                }
            }

            System.out.println("You've won " + roundsWon + " rounds.");

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing! Your total rounds won: " + roundsWon);
        scanner.close();
    }
}


