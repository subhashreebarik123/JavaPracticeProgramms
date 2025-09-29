package CoreJavaDailyExamples;

interface Flyable {
    void fly();
}
interface Swimmable {
        void swim();
    }

    class Duck implements Flyable, Swimmable {
        public void fly() {
            System.out.println("Duck flies short distances");
        }

        public void swim() {
            System.out.println("Duck swims in water");
        }
    }

    class Main4 {
        public static void main(String[] args) {
            Duck d = new Duck();
            d.fly();
            d.swim();
        }
}
