package homework.EasyPractice;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RandomString {
    private static final char[] arr = {'a', 'b', 'c', 'd', 'e'};
    public static void main(String[] args) {

        String str = "";

        for (int i = 0; i < 7; i++){
            int randomValue = ThreadLocalRandom.current().nextInt(arr.length);
            str += arr[randomValue];
        }

        System.out.println(str);

        System.out.println(isDuplicateExist(str));
        printValues(str);
    }

    static boolean isDuplicateExist (String str){

        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (temp == str.charAt(j)){
                    return true;
                }
            }
        }

        return false;
    }

    static void printValues(String value){ // пришла строка
        System.out.println("to method - " + value);
        int[] valueCounter = new int[arr.length]; // завели массив интов, равный по длине массиву чаров - для того, чтобы записывать значения количества повторяющихся элементов
        String values = String.valueOf(arr); // завели новую строку, слепив массив чаров для того, чтобы применять методы строк
        System.out.println(Arrays.toString(value.toCharArray()));
        for (char c : value.toCharArray()) { // берем каждый элемент из строки (а мы ее преобразовали, чтобы применять методы массивов)
            valueCounter[values.indexOf(c)]++; // значение индекса массива интов (изначально 0) увеличиваем на 1..т.е. нашел символ с, увеличил на 1..нашел еще раз - он стал 2
        }
        System.out.println(Arrays.toString(valueCounter));
        for (int i = 0; i < valueCounter.length; i++){ // проходим по массиву интов (с количеством повторений символов)
            if (valueCounter[i] > 0) { // если значение элемента массива интов больше 0
                System.out.println(arr[i] + " = " + valueCounter[i]); // выводим соответствующий элемент массива + количество его повторений
            }
        }
    }
}
