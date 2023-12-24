package homework.EasyPractice.danIT.hw2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("All set. Get ready to rumble!");
        int[][] goal = createGoal();
        System.out.println(goal[0][0]);
        System.out.println(goal[1][0]);
        String[][] gameArea = createGameArea();
        getGameArea(gameArea);
        int[][] shoot = shooting();
        while (!Arrays.deepEquals(goal, shoot)) {
            getGameArea(checkShooting(gameArea, goal, shoot));
            shoot = shooting();
        }
        getGameArea(checkShooting(gameArea, goal, shoot));
    }

    public static String[][] createGameArea() {
        String[][] gameArea = new String[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || j == 0) {
                    gameArea[i][j] = String.valueOf((char) ('0' + (i + j) % 6));
                }
                 else {
                    gameArea[i][j] = String.valueOf('-');
                }
            }
        }
        return gameArea;
    }

    public static String[][] checkShooting(String[][] gameArea, int[][] goal, int[][] shoot){
                if (!Arrays.deepEquals(goal, shoot)) {
                    gameArea[shoot[0][0]][shoot[1][0]] = String.valueOf('*');
                }
                else {
                    gameArea[goal[0][0]][goal[1][0]] = String.valueOf('x');
                    System.out.println("Есть попадание!!!");
        }
        return gameArea;
    }

    public static void getGameArea(String[][] array) {
        for (String[] strings : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(strings[j] + " | ");
            }
            System.out.println();
        }
    }

    public static int[][] shooting() {
        int[][] shoot = new int[2][1];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для стрельбы 1 - 5");
        shoot[0][0] = scanner.nextInt();
        System.out.println("Введите столбец для стрельбы 1 - 5");
        shoot[1][0] = scanner.nextInt();
        return shoot;
    }

    public static int[][] createGoal() {
        Random random = new Random();
        int[][] goal = new int[2][1];
        goal[0][0] = random.nextInt(1, 6);
        goal[1][0] = random.nextInt(1, 6);
        return goal;
    }
}

