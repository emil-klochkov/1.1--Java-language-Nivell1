package Level1.exercise1;

public class String_instruments extends instruments {

    static {
        System.out.println("The String class has been loaded into memory.");
    }

    public String_instruments(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A string tool is playing.");
    }
}
