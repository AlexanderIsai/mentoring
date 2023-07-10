package homework.javaBasicHW5;

import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isEdekaOpen = true;
        boolean isReweOpen = true;

        System.out.println("Edeka работает? Y/N");
        String edeka = scanner.nextLine();
        if (edeka.equalsIgnoreCase("N")){
            isEdekaOpen = false;
        }
        System.out.println("Rewe работает? Y/N");
        String rewe = scanner.nextLine();
        if (edeka.equalsIgnoreCase("N")){
            isReweOpen = false;
        }
        System.out.println("Я могу купить еду: " + canBuy(isEdekaOpen, isReweOpen));

    }

    public static boolean canBuy (boolean isEdeka, boolean isRewe){
        return isEdeka || isRewe;
    }
}
