package Level1.exercise1;

public abstract class instruments {

    protected String name;
    protected double price;


    static {
        System.out.println("The Tool class has been loaded into memory.");
    }



    public instruments(String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println("A new instrument has been created.");
    }

    public abstract void play();
}
