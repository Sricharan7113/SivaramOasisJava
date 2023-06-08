import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int guess;
        
        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I have chosen a number between 1 and 100. Can you guess it?");
        
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly in " + attempts + " attempts.");
            }
        } while (guess != randomNumber);
        
        scanner.close();
    }
}
