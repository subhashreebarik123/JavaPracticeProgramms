package CoreJavaPractice;

public class StringWithSwitchCase {

        public static void main(String[] args) {
            String fruit = "Apple";

            switch (fruit) {
                case "Apple":
                    System.out.println("It's an apple.");
                    break;
                case "Banana":
                    System.out.println("It's a banana.");
                    break;
                case "Orange":
                    System.out.println("It's an orange.");
                    break;
                default:
                    System.out.println("Unknown fruit.");
            }
        }
    }
