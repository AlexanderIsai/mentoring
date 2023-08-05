package homework.lottery;

import java.util.Arrays;
import java.util.Random;


public class LotteryEngine {
    static int start = 1;
    static int end = 50;

    public static int[] lotteryGo(int quantityNumbers) {
        Random random = new Random();
        int[] lotteryRandom = new int[quantityNumbers];

        for (int i = 0; i < quantityNumbers; i++) {
            int temp = random.nextInt(start, end + 1);
            while (linearSearch(lotteryRandom, temp) != -1) {
                temp = random.nextInt(start, end + 1);
            }
            if (linearSearch(lotteryRandom, temp) == -1) {
                lotteryRandom[i] = temp;
            }
        }
        return lotteryRandom;
    }

    public static void compareNumbers(int[] playerNumbers, int[] lotteryNumbers) {
        int count = 0;
        System.out.println("Players numbers: " + Arrays.toString(playerNumbers));
        for (int numPl : playerNumbers) {
            for (int numLo : lotteryNumbers) {
                if (numLo == numPl) {
                    System.out.println("YOU WIN! Your number " + numPl + " is lucky");
                    count++;
                }

            }
        }
        System.out.println("YOU win " + count + " numbers");
    }

    public static int linearSearch(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
