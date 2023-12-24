package homework.listPractice;

//Уровень сложности 5 из 10:
//
//        Найти сумму всех элементов ArrayList<Integer>.
//        Найти среднее значение элементов LinkedList<Integer>.
//        Перебрать ArrayList<String> и вывести все элементы на экран.
//        Перебрать LinkedList<String> и найти самую длинную строку.
//        Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
//
//        Уровень сложности 6 из 10:
//        Перебрать ArrayList<Integer> и найти наименьший элемент.
//        Перебрать LinkedList<Integer> и найти наибольший элемент.
//        Перебрать ArrayList<String> и найти количество элементов, начинающихся с определенной буквы.
//        Перебрать LinkedList<String> и найти первое вхождение определенной строки.
//        Создать LinkedList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.
//
//        Уровень сложности 7 из 10:
//        Перебрать ArrayList<Integer> и удалить все четные числа.
//        Перебрать LinkedList<Integer> и заменить все элементы, кратные 3, на нули.
//        Перебрать ArrayList<String> и объединить все элементы в одну строку.
//        Перебрать LinkedList<String> и удалить все элементы, содержащие определенную подстроку.
//        Создать ArrayList с объектами вашего собственного класса и вывести только те, которые удовлетворяют определенному условию.

import java.util.*;

public class MainList {

    public static void main(String[] args) {
        List<Integer> list = listIntegerGeneration();
        System.out.println(list);
        //        Найти сумму всех элементов ArrayList<Integer>.
        System.out.println(getSumElements(list));
        //Найти среднее значение элементов LinkedList<Integer>
        System.out.println(getAverageValue(list));
        //Перебрать ArrayList<String> и вывести все элементы на экран.
        printArrayList(list);
        //Перебрать LinkedList<String> и найти самую длинную строку.
        List<String> listString = listStringGeneration();
        System.out.println(listString);
        System.out.println(getLongestString(listString));
        //Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
        ArrayList<TestObj> testObjs = new ArrayList<TestObj>();
        testObjs.add(new TestObj("Vasya", 42, true));
        testObjs.add(new TestObj("Sasha", 43, true));
        testObjs.add(new TestObj("Irgendwer", 152, false));
        System.out.println(testObjs);
        //Перебрать ArrayList<Integer> и найти наименьший элемент.
        System.out.println(getMinValue(list));
        //Перебрать LinkedList<Integer> и найти наибольший элемент.
        System.out.println(getMaxValue(list));
        //Перебрать ArrayList<String> и найти количество элементов, начинающихся с определенной буквы.
        System.out.println(getNumbersOfElements(listString, 'f'));

    }

    static List<Integer> listIntegerGeneration(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of List");
        int size = scanner.nextInt();
        System.out.println("Enter max value of List");
        int maxValue = scanner.nextInt();
        System.out.println("Press 1, if you want to create ArrayList! Press 2, if you want to create LinkedList");
        int id = scanner.nextInt();
        if (id == 1) {
            List<Integer> arrayList = new ArrayList<Integer>(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(random.nextInt(maxValue));
            }
            return arrayList;
        }
        else {
            List<Integer> linkedList = new LinkedList<Integer>();
            for (int i = 0; i < size; i++) {
                linkedList.add(random.nextInt(maxValue));
            }
            return linkedList;
        }
    }
    static int getSumElements(List<Integer> arrayList){
        int sum = 0;
        for (int element: arrayList) {
            sum += element;
        }
        return sum;
    }
    static double getAverageValue(List<Integer> linkedList){
        double temp = linkedList.size();
        return Math.round((getSumElements(linkedList) / temp) * 100.0) / 100.0;
    }

    static void printArrayList(List<Integer> arrayList){
        for (Integer element: arrayList) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    static List<String> listStringGeneration(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quantity of words");
        int size = scanner.nextInt();
        System.out.println("Enter min and max length of String without backspace");
        int temp = scanner.nextInt();
        int min = temp / 10;
        int max = temp % 10;
        List<String> stringList = new LinkedList<String>();
        for (int i = 0; i < size; i++) {
            stringList.add(stringGeneration(min, max+1));
        }
        return stringList;
    }
    static String stringGeneration(int min, int max){
        Random random = new Random();
        char[] symbols = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        StringBuilder stringBuilder = new StringBuilder();
        int stringSize = random.nextInt(min, max);
        for (int i = 0; i < stringSize; i++) {
            stringBuilder.append(symbols[random.nextInt(symbols.length)]);
        }
        return stringBuilder.toString();
    }
    static String getLongestString(List<String> stringLinkedList) {
        StringBuilder longest = new StringBuilder();
        longest.append(stringLinkedList.get(0));
        for (String string: stringLinkedList) {
            if(string.length() > longest.length()){
                longest = new StringBuilder(string);
            }
        }
        System.out.println(longest);
        return longest.toString();
    }
    static int getMinValue(List<Integer> arrayList){
        int minValue = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++){
            if(arrayList.get(i) < minValue){
                minValue = arrayList.get(i);
            }
        }
        return minValue;
    }
    static int getMaxValue(List<Integer> arrayList){
        int maxValue = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++){
            if(arrayList.get(i) > maxValue){
                maxValue = arrayList.get(i);
            }
        }
        return maxValue;
    }

    static int getNumbersOfElements(List<String> list, char symbol){
        int count = 0;
        for (String str: list) {
            if(str.charAt(0) == symbol){
                count++;
            }
        }

        return count;
    }


}
