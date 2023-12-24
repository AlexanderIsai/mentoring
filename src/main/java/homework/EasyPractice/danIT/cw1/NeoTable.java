package homework.EasyPractice.danIT.cw1;

import java.io.IOException;
import java.util.Random;

public class NeoTable {

    public static void main(String[] args) throws InterruptedException, IOException {

        int[][] grid = new int[20][50];
        Random random = new Random();

        while (true){
            int row = random.nextInt(20);
            int column = random.nextInt(50);
            int value = random.nextInt(1, 10);

            grid[row][column] = value;
            print(grid);

            Thread.sleep(39);
            System.out.print("\033[H\033[2J");
            Runtime.getRuntime().exec("clear");
        }
    }
    private static void print(int[][] arr){
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }
}
