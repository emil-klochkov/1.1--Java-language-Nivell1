package Level1.exercise1;

public class String_tools extends Tools {

    static {
        System.out.println("The String class has been loaded into memory.");
    }

    public String_tools(String name, double price) {
        super(name, price);
    }

    @Override
    public void touch() {
        System.out.println("A string tool is playing.");
    }
}
