package Level1.exercise1;

public class Percussion_instruments extends instruments {

    static {
        System.out.println("The Percussion class has been loaded into memory.");
    }

    public Percussion_instruments(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A percussion tool is playing.");
    }
}
