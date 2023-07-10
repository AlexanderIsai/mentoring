package homework.javaBasicHW5;

import java.util.Scanner;

public class Walking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isWeekend = true;
        boolean isRain = true;
        boolean canWalk = true;

        System.out.println("Сегодня выходной? Y/N:");
        String day = scanner.nextLine();
        if (day.equalsIgnoreCase("N")){
            isWeekend = false;
        }
        System.out.println("На улице идет дождь? Y/N:");
        String weather = scanner.nextLine();
        if (weather.equalsIgnoreCase("Y")) {
            isRain = false;
        }
        if (isRain && isWeekend){
            System.out.println("Ты можешь идти гулять, потому что canWalk - " + canWalk);
        } else {
            canWalk = false;
            System.out.println("Ты не можешь идти гулять, потому что canWalk - " + canWalk);
        }
    }
}
