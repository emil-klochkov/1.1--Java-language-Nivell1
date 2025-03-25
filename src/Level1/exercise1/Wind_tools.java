package Level1.exercise1;

public class Wind_tools extends Tools {

    static {
        System.out.println("The Wind class has been loaded into memory.");
    }

    public Wind_tools(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void touch() {
        System.out.println("A wind tool is playing");
    }
}
