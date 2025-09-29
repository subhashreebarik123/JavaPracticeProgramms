package CoreJavaPractice;

public class MainMethodOverriding {

    public static void main(String[] args) {
        System.out.println("Main method ex1");
    }
}
class Child extends MainMethodOverriding {
    public static void main(String[] args) {
        System.out.println("Main method ex2");
    }

}