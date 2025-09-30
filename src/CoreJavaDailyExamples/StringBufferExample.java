package CoreJavaDailyExamples;

public class StringBufferExample {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");


        sb.append(" World");
        System.out.println("After append: " + sb);
    }
}