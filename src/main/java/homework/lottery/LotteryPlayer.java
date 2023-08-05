package homework.lottery;

import java.util.Scanner;

public class LotteryPlayer {

    static Scanner scanner = new Scanner(System.in);

    public LotteryPlayer(int quantityNumbers) {
        this.quantityNumbers = quantityNumbers;
    }

    public int getQuantityNumbers() {
        return quantityNumbers;
    }

    public void setQuantityNumbers(int quantityNumbers) {
        this.quantityNumbers = quantityNumbers;
    }

    public int[] getNumbers(int q) {
        numbers = getArrayNumbers(q);
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    int quantityNumbers;
    int[] numbers = getArrayNumbers(quantityNumbers);

    public int[] getArrayNumbers(int q) {
        int[] array = new int[q];
        for (int i = 0; i < q; i++) {
            System.out.println("Choose your " + (i + 1) + " number");
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
