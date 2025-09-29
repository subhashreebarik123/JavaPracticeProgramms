package Java8Example;

@FunctionalInterface
interface FunctionalInterfaceEx {

    void sayHello(String name);
}

class Main {
    public static void main(String[] args) {

        FunctionalInterfaceEx functionalInterfaceEx = (name) -> System.out.println("Hello, " + name);

        functionalInterfaceEx.sayHello("Alice");
        functionalInterfaceEx.sayHello("Bob");
    }
}