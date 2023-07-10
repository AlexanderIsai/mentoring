
//сломанный лифт
//        лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж.
//        Лифт сломан. Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем подьеме лифт
//        превысил колличество этажей, то считается что лифт поднялся на самый верх. Найдите количество подьемов,
//        которые понадобятся лифту.
//
//        Ввод:
//        H = 200, N = 50, M = 1
//        Ответ: 5
//        Объяснение:
//        Первый подьем: 50 - 1 = 49
//        Второй подьем: 49 + 50 - 1 = 98
//        Третий подьем: 98 + 50 - 1 = 147
//        Четвертый подьем: 147 + 50 - 1 = 196
//        Пятый подьем: выйти за пределы H.
//
//        реализовать метод numberOfLifts(int floor, int stepUp, int stepDown)
package homework.javaBasicHW51;
import java.util.Scanner;

public class Aufzug {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество этажей здания. Больше 3-х, пожалуйста");
        int floor = scanner.nextInt();
        while (floor < 4){
            System.out.println("У Вас очень низкий дом или вообще шахта)). Введите снова: ");
            floor = scanner.nextInt();
        }
        System.out.println("Введите количество этажей, на которые может подняться лифт, Больше 2-х, пожалуйста");
        int stepUp = scanner.nextInt();
        while (stepUp < 3){
            System.out.println("Наш лифт точно может подняться на высоту больше 2-х этажей)). Введите снова: ");
            stepUp = scanner.nextInt();
        }
        System.out.println("Введите количество этажей, на которое он спускается из-за поломки");
        int stepDown = scanner.nextInt();
        while (stepDown >= stepUp){
            System.out.println("Так мы никуда не уедем. Введите снова: ");
            stepDown = scanner.nextInt();
        }
        numberOfLifts(floor, stepUp, stepDown);
    }

    public static void numberOfLifts(int floor, int stepUp, int stepDown){
        int up = 0;
        int j = 0;
        while (up < floor) {
            j++;
             up = up + stepUp;
            if (up >= floor){
                break;
            }
            up = up - stepDown;
        }
        System.out.println("Количество подъемов - " + j);
    }
}
