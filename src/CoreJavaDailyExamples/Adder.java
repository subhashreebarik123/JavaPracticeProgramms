package CoreJavaDailyExamples;

public class Adder {
    public int add (int a , int b){
        return a+b;
    }
    public  double add(double a , double b , double c){
        return a+b+c;
    }
}
class Example{
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(10,20));
       System.out.println(adder.add(10,20,30));

    }
}