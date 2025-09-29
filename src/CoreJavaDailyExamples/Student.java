package CoreJavaDailyExamples;


    class Student {

        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            } else {
                System.out.println("Age must be positive!");
            }
        }
    }

    class Main5 {
        public static void main(String[] args) {
            Student s = new Student();

            s.setName("Alice");
            s.setAge(20);

            System.out.println("Name: " + s.getName());
            System.out.println("Age: " + s.getAge());

            s.setAge(-5);
        }
}
