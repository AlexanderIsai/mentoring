package homework.stringBilderTest;

import java.util.Arrays;

public class TestSB {

    public static void main(String[] args) {

        String a = "Hello";
        String b = " ";
        String c = "world!";
        StringBuilder builder = new StringBuilder();
        builder.append(a).append(b).append(c);
        System.out.println(builder);
        builder.insert(builder.indexOf(" ") + 1, "beautiful ");
        System.out.println(builder);
        System.out.println("Capacity of builder " + builder.capacity());
        System.out.println("Size of builder " + builder.length());
        char[] arrayCharSB = new char[builder.length()];
        builder.getChars(0, builder.length(), arrayCharSB, 0);
        System.out.println(Arrays.toString(arrayCharSB));

    }
}
