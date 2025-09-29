package CoreJavaDailyExamples;

public class PrivateConstructorEx {

    private PrivateConstructorEx(){
        System.out.println("Private constructor created");
    }
    public static int add(int a , int b){
        return a*b;
    }
}
class main{
    public static void main(String[] args) {
        int result = PrivateConstructorEx.add(10,20);
        System.out.println("Sum of this result is : " +result);
    }
}