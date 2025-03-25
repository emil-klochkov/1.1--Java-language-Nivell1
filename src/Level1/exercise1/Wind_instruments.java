package Level1.exercise1;

public class Wind_instruments extends instruments {

    static {
        System.out.println("The Wind class has been loaded into memory.");
    }

    public Wind_instruments(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void play() {
        System.out.println("A wind tool is playing");
    }
}
