import java.util.Scanner;  
import java.util.Random;  

public class GuessingGame {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int userGuess = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it in as few attempts as possible.");  
     
        while (userGuess != numberToGuess) {
            
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfTries++;
              
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number.");
                System.out.println("It took you " + numberOfTries + " attempts.");
            }
        }
        scanner.close();
    }
}
