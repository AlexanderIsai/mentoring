package homework.javaBasicHW4;

import java.util.Scanner;

public class HW4_MathOp {

    public static void main(String[] args) {

        System.out.println("Начало работы программы по математическим операциям");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число...проверять не буду, надеюсь на сознательность");
        int firstNum = scanner.nextInt();
        System.out.println("Введите второе целое число и не 0, пожалуйста, проверять не буду((");
        int secondNum = scanner.nextInt();

        System.out.println("Сумма - " + firstNum + " + " + secondNum + " = " + sumNumbers(firstNum, secondNum));
        System.out.println("Вычитание - " + firstNum + " - " + secondNum + " = " + subNumbers(firstNum, secondNum));
        System.out.println("Умножение - " + firstNum + " * " + secondNum + " = " + multiNumbers(firstNum, secondNum));
        divNumbers(firstNum, secondNum);

        System.out.println("Спасибо за внимание. Программа работу закончила");

    }

    public static int sumNumbers (int first, int second){
        return first + second;
    }

    public static int subNumbers (int first, int second){
        return first - second;
    }

    public static int multiNumbers (int first, int second){
        return first * second;
    }

    public static void divNumbers (double first, int second){
        if (second ==0){
            System.out.println("Я устал, я ухожу...на 0 делить нельзя");
            return ;
        }
        System.out.println("Деление - " + first + " / " + second + " = " + (first / second));
    }


}
