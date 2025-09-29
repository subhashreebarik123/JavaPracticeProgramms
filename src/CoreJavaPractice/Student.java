package CoreJavaPractice;

public class Student {
    String name;
    int id;

    Student(String name , int id){
        this.name=name;
        this.id=id;
    }

    public void display(){
        System.out.println(" Name " + name + " Id " + id);
    }
}
class Main {
    public static void main(String[] args) {
        Student student = new Student("Mama" ,100);
        Student student1 = new Student("Subha",101);

        student.display();
        student1.display();
    }
}
