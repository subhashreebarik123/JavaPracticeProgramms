package CoreJavaDailyExamples;

public class Animal1 {
    void eat() {
        System.out.println("Animal eating");
    }

    static class Dog1 extends Animal1 {
        void eat() {
            System.out.println("Dog eating");
        }

        public void display() {
            eat();
            super.eat();
        }
    }

    class Main1 {
        public static void main(String[] args) {
            Dog1 dog1 = new Dog1();
            dog1.display();
        }
    }
}
