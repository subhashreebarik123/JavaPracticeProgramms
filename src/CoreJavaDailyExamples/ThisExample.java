package CoreJavaDailyExamples;

public class ThisExample {
    int id ;
    String name ;

    ThisExample (int id , String name){
        this.id=id;
        this.name=name;
    }
    public  void get(){
        System.out.println("Id : "+id +" Name : "+name);
    }
}
class  Main2{
    public static void main(String[] args){
        ThisExample thisExample = new ThisExample(100,"Subhashree");
        ThisExample thisExample1 = new ThisExample(101, "Mama");
        thisExample.get();
        thisExample1.get();

    }
}
