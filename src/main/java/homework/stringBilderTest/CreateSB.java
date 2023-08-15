package homework.stringBilderTest;

public class CreateSB {

    public static void main(String[] args) {

        StringBuilder builder1 = new StringBuilder();

        String str = "Hello, world!";

        StringBuilder builder2 = new StringBuilder(str);

        StringBuilder builder3 = new StringBuilder(100);

        builder1.append("StartaUniversity");
        System.out.println("1: " + builder1);
        System.out.println("2: " + builder2);
        System.out.println("3: " + builder3);
        System.out.println(builder2.reverse());


    }
}
