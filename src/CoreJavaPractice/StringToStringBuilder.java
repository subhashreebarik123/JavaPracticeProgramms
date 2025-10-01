package CoreJavaPractice;

public class StringToStringBuilder {

        public static void main(String[] args) {
            String str = "Hello World";

            StringBuilder sb = new StringBuilder(str);

            sb.append("!!!");
            System.out.println(sb);
        }
    }

