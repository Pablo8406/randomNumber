import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int limit = 1000;
        int shoots = 10;
        int yourNumber = 0;
        System.out.println("The program is randomizing a number between 1 and " + limit);
        Random random = new Random();
        int randomNumber = random.nextInt(limit) + 1;
      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess what the program drew.");

        while (yourNumber != randomNumber && shoots > 0) {
            System.out.println("Enter the number, you have " + shoots-- + " tries :");
            yourNumber = scanner.nextInt();
            if (yourNumber == randomNumber) {
                System.out.println("Bravo you won");

            } else if (yourNumber > randomNumber) {
                System.out.println("TYour number is too high");

            } else {
                System.out.println("Your number is too low");
            }
            System.out.println();
            if (yourNumber != randomNumber && shoots == 0) {
                System.out.println("The program drew " + randomNumber + " , you lost loser");
            }
        }
        System.out.println("Game Over");

    }

}

