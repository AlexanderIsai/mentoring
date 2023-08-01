package homework.stringBilderTest;

public class TestSBuffer {

    public static void main(String[] args) {

        String str = "It is String Builder Object";
        StringBuffer buffer = new StringBuffer(str);
        buffer.replace(buffer.indexOf("Builder"), buffer.indexOf("Builder") + "Builder".length(), "Buffer");
        System.out.println(buffer);
    }
}
