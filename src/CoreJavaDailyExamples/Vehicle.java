package CoreJavaDailyExamples;

abstract class Vehicle {
    abstract void start();

    void fuelType() {
        System.out.println("Petrol or Diesel");
    }
}

    class Bike extends Vehicle {
        void start() {
            System.out.println("Bike starts ");
        }
    }

    class Car extends Vehicle {
        void start() {
            System.out.println("Car starts ");
        }
    }

    class Main {
        public static void main(String[] args) {
            Vehicle v1 = new Bike();
            v1.start();
            v1.fuelType();

            Vehicle v2 = new Car();
            v2.start();
        }
    }

