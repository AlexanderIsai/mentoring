package homework.javaBasicHW4;

import java.util.Scanner;

public class CountCalories {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Начало работы калькулятора калорий))");
        double quantityCalStandart = Math.PI * 12 * 12 * 40;
        System.out.println("В стандартной пицце диаметром 24см - " + Math.round(quantityCalStandart) + " калорий");
        System.out.println("Укажите диаметр пиццы, которую Вы хотели бы заказать");
        double diameter = scanner.nextInt();
        int squarePizza = (int) Math.round(Math.pow (diameter /2, 2) * Math.PI);
        if (diameter > 24) {
            System.out.println("Вы заказали пиццу диаметром на " + (int)(diameter - 24) + " см больше, чем стандартная. Вы получите больше на " +
                    (int)(squarePizza * 40 - quantityCalStandart) + " калорий. Т.е. всего - " + squarePizza * 40 + " калорий");
        }
        else {
            System.out.println("Вы заказали пиццу диаметром на " + (int)(24 - diameter) + " см меньше, чем стандартная. Вы получите меньше на " +
                    (int)(quantityCalStandart - squarePizza * 40 ) + " калорий Т.е. всего - " + squarePizza * 40 + " калорий");
        }


        System.out.println("Конец работы программы");
    }
}
