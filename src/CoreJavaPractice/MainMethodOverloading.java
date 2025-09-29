package CoreJavaPractice;

public class MainMethodOverloading {

    public static void main(String[] args) {
        System.out.println("Main method 1");
        main(10);
    }

    public static void main(int a) {
        System.out.println("Main method 2 : " + a );
    }
}
