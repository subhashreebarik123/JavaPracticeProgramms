package CoreJavaPractice;

public class StringExample {

        public static void main(String[] args) {

            String str1 = "Hello";
            String str2 = new String("World");

            String result = str1 + " " + str2;

            System.out.println("Original String: " + result);
            System.out.println("Length: " + result.length());
            System.out.println("Uppercase: " + result.toUpperCase());
            System.out.println("Lowercase: " + result.toLowerCase());
            System.out.println("Character at index 1: " + result.charAt(1));
            System.out.println("Substring (0,5): " + result.substring(0, 5));
            System.out.println("Does it contain 'World'? " + result.contains("World"));
            System.out.println("Replace Hello with Hi: " + result.replace("Hello", "Hi"));
        }
    }

