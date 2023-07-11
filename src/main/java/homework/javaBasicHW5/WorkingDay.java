package homework.javaBasicHW5;

import java.util.Random;

public class WorkingDay {

    public static void main(String[] args) {

        Random random = new Random();
        int seconds = random.nextInt(28801);
        calculateRestOfTime(seconds);
    }

    public static void calculateRestOfTime (int sec){
        System.out.println("Для тех, кто умеет считать - до конца рабочего дня осталось: " + sec + " секунд");
        int hour = (sec / 3600);
//        int min = (sec % 3600 / 60 );
//        int secRest = sec - hour * 3600 - min * 60;
        String timeWord = " часов";
        if (hour > 1 && hour < 5){
            timeWord = " часа";
        } else if (hour == 1){
            timeWord = " час";
        }
//        System.out.println("До конца рабочего дня осталось: " + hour + timeWord + ", " + min + " минут, и " + secRest + " секунд" );
//
//        System.out.println("И дополнительно, с условием))");
        if (hour < 1){
            System.out.println("Осталось менее одного часа");
        } else {
            System.out.println("Осталось: " + hour + timeWord);
        }
    }
}
