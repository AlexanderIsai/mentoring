package homework.javaBasicHW5;

import java.util.Scanner;

public class Laboratory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите первую температуру");
        int temperature1 = scanner.nextInt();
        System.out.println("Укажите вторую температуру");
        int temperature2 = scanner.nextInt();
        checkDevice(temperature1, temperature2);


    }

    public static void checkDevice (int tem1, int tem2){
        System.out.println(tem1 > 100 && tem2 < 100);
    }
}
