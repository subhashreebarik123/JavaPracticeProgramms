package CoreJavaDailyExamples;

public class Animal {
    public void eat(){
        System.out.println("Animal eating");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("Dog eating");
    }
}
class Main1{
    public static void main(String[] args){
        Animal dog = new Dog();
        dog.eat();
    }
}