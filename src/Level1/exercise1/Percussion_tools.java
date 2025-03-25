package Level1.exercise1;

public class Percussion_tools extends Tools {

    static {
        System.out.println("The Percussion class has been loaded into memory.");
    }

    public Percussion_tools(String name, double price) {
        super(name, price);
    }

    @Override
    public void touch() {
        System.out.println("A percussion tool is playing.");
    }
}
