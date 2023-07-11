package homework.toCamelCase;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your phrase");
        String phrase = scanner.nextLine();
        System.out.println(phraseToCamelCAse(phrase));
    }
    public static String phraseToCamelCAse(String phrase){
        String[] arrayString = phrase.toLowerCase().split(" ");
        StringBuilder phraseCamelCase = new StringBuilder();
        for (String word : arrayString) {
            String[] wordString = word.split("");
            for (int i = 0; i < wordString.length; i++) {
                if (i == 0){
                    wordString[i] = wordString[i].toUpperCase();
                }
                phraseCamelCase.append(wordString[i]);
            }
        }
        return phraseCamelCase.toString();
    }
}
