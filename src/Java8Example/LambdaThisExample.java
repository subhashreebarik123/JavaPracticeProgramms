package Java8Example;

public class LambdaThisExample {


        private String name = "OuterClass";

        public void testLambda() {
            Runnable r1 = () -> {
                System.out.println("Inside Lambda: " + this.name);
            };

            Runnable r2 = new Runnable() {
                String name = "InnerClass";
                @Override
                public void run() {
                    System.out.println("Inside Anonymous Class: " + this.name);
                }
            };

            r1.run();
            r2.run();
        }

        public static void main(String[] args) {
            new LambdaThisExample().testLambda();
        }
    }

