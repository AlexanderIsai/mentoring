package homework.maxNumber;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int first = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int second = scanner.nextInt();

        System.out.print("Введите третье целое число: ");
        int third = scanner.nextInt();

        System.out.println("Максимальное число: " + findMaxNumber(first, second, third));
    }

    public static int findMaxNumber(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }
}

