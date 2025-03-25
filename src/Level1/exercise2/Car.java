package Level1.exercise2;

public class Car {
    public static final String BRAND = "Toyota";
    public static String model;
    public final int POWER;


    public Car(String brand, int POWER) {
        Car.model = model;
        this.POWER =POWER;
    }


    public static void brake() {
        System.out.println("The car is braking.");
    }


    public void accelerate() {
        System.out.println("The car is accelerating.");
    }
}
