package Level1.exercise2;

public class Car {
    public static final String BRAND = "Toyota";
    public static String model;
    public final int potential;


    public Car(String brand, int potential) {
        Car.model = model;
        this.potential = potential;
    }


    public static void brake() {
        System.out.println("The car is braking.");
    }


    public void accelerate() {
        System.out.println("The car is accelerating.");
    }
}
