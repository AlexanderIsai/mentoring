package homework.EasyPractice.danIT.hw1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int secretNumber = random.nextInt(1, 101);
        StringBuilder builder = new StringBuilder();

        System.out.println(secretNumber);

        System.out.println("Input your name, plz");

        String name = scanner.nextLine();

        System.out.println("Let the game begin");

        System.out.println("Input your number, plz");
        int playerNumber = scanner.nextInt();

        while (playerNumber!= secretNumber) {
            builder.append(playerNumber).append(", ");
            if (playerNumber < secretNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else {
                System.out.println("Your number is too big. Please, try again.");
            }
            playerNumber = scanner.nextInt();
        }

        String[] numbersString = builder.toString().split(", ");

        int[] results = new int[numbersString.length + 1];
        for (int i = 0; i < results.length - 1; i++) {
            results[i] = Integer.parseInt(numbersString[i]);
        }
        results[results.length - 1] = playerNumber;
        Arrays.sort(results);

        System.out.println("Congratulation, " + name);
        System.out.println("Your numbers were: " + Arrays.toString(results));
    }
}
