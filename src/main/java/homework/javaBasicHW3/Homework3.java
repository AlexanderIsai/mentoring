package homework.javaBasicHW3;

public class Homework3 {
    static String str = new String("I study Basic Java!");
    public static void handlingString(String str){


        System.out.println(str.charAt(str.length()-2));

        if (str.contains("Java")){
            System.out.println("Строка содержит слово 'Java' это - " + str.contains("Java"));
        } else System.out.println("Строка не содержит слово 'Java' это - " + str.contains("Java"));
        System.out.println(str.substring(0, 14));
        System.out.println(str.replace('a', 'o'));

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

    }

    public static void main(String[] args) {
        System.out.println("Начало работы программы");

        handlingString(str);
        System.out.println("Конец работы программы");


    }
}
