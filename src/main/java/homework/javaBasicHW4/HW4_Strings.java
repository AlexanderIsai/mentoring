package homework.javaBasicHW4;

import java.util.Scanner;

public class HW4_Strings {

    public static void main(String[] args) {

        System.out.println("Начало работы программы");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово, содержащее четное количество букв");
        String firstWord = scanner.nextLine();
        while (firstWord.length() % 2 != 0) {
            System.out.println("Вы ввели слово с нечетным количеством букв, будьте внимательны. Вводите снова");
            firstWord = scanner.nextLine();
        }
        System.out.println("Введите второе слово, содержащее четное количество букв");
        String secondWord = scanner.nextLine();
        while (secondWord.length() % 2 != 0) {
            System.out.println("Вы ввели слово с нечетным количеством букв, будьте внимательны. Вводите снова");
            secondWord = scanner.nextLine();
        }

        mixWords(firstWord, secondWord);


    }

    public static void mixWords (String first, String second){
        System.out.println("А вместе их половинки - " + first.substring(0, (first.length()/2)) + second.substring((second.length()/2)));
    }


}
