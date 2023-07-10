package homework.javaBasicHW2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        char testChar = 'G';
        int testInt = 89;
        byte testByte =  4;
        short testShort = 56;
        float testFloat = 4.7333436F;
        double testDouble = 4.355453532;
        long testLong = 12121;
        System.out.println("char: " + testChar + "\n" + "integer: " + testInt + "\n" + "byte: " + testByte
                + "\n" + "short: " + testShort + "\n" + "float: " + testFloat + "\n" + "integer: " + testInt + "\n" + "double: " + testDouble
                + "\n" + "long: " + testLong);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 3-значное число: ");
        int num = scanner.nextInt();
        System.out.println("Первая цифра - " + num / 100);
        System.out.println("Средняя цифра - " + num / 10 % 10);
        System.out.println("Последняя цифра - " + num % 10);

    }
}
