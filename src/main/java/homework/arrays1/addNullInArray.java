package homework.arrays1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class addNullInArray {

    public static void main(String[] args) {

        int[] userArray = createRandomArray();
        System.out.println("Массив случайных чисел: " + Arrays.toString(userArray));
        System.out.println("Заменили нечетные индексы на ноль: " + Arrays.toString(changeOddElemToNull(userArray)));

    }

    public static int[] createRandomArray() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a size of array");
        int size = scanner.nextInt();
        System.out.println("Input a min value for diapason");
        int minValue = scanner.nextInt();
        System.out.println("Input a max value for diapason");
        int maxValue = scanner.nextInt();
        int[] userArray = new int[size];
        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = random.nextInt(minValue, maxValue+1);
        }
        return userArray;
    }

    public static int[] changeOddElemToNull(int[] array){
        for (int i = 0; i < array.length; i++){
            if(i % 2 != 0){
                array[i] = 0;
            }
        }
        return array;
    }
}