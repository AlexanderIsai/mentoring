package homework.javaBasicHW4;

import java.util.Scanner;

public class CurrentExchange {

    public static void main(String[] args) {

        System.out.println();
        double curs = 1.12;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Наш курс доллар - евро сегодня - 1 : " + curs + ". Сколько евро Вы хотите обменять? Введите положительное целое число");
        int euro = scanner.nextInt();
        while (euro <= 0) {
            System.out.println("А теперь серьезно...введите целое положительное число");
            euro = scanner.nextInt();
        }
        System.out.printf("Ваша сумма в долларах - %.2f %n", euro*curs);
    }
}
