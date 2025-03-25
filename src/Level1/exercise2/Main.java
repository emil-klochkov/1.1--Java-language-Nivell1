package Level1.exercise2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Brand of car: " + Car.BRAND);
        Car.model = "Corolla";
        System.out.println("Car model: " + Car.model);


        Car car1 = new Car("Corolla", 150);
        System.out.println("Car potential: " + car1.potential);

        Car.brake();

        car1.accelerate();
    }
}