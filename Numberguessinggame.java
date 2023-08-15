import java.util.Random;
import java.util.Scanner;

public class Numberguessinggame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String play = "yes";


        while (play.equals("yes")) {
            Random rand = new Random();
            int randNum = rand.nextInt(100);
            int guess = -1;
            int tries = 0;


            while (guess != randNum) {
                System.out.print("Guess a number between 1 and 100: ");
                guess = reader.nextInt();
                tries++;

                if (guess == randNum) {
                    System.out.println("Awesome! You guessed the number!");
                    System.out.println("It onlu took you " + tries + "huesses! ");
                    System.out.println("Would you like to play again? yes or no: ");
                    play = reader.next().toLowerCase();
                } else if (guess > randNum) {
                    System.out.println("your guess is too high, try again");
                } else {
                    System.out.println("your guess is too low, try again");
                }
            }

        }
        reader.close();
    }
}
