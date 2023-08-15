package homework.EasyPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangePlace {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a + " b = " + b);
        int[] arr = {1, 3, 4, 5, 2, 8};

        System.out.println(Arrays.toString(invertArr(arr)));

    }

    private static int[] invertArr(int[] arr){
        int[] resultArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            resultArr[i] = arr[arr.length - 1 - i];
        }
        return resultArr;
    }
}
