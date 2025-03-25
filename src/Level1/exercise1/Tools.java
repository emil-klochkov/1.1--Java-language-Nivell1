package Level1.exercise1;

public abstract class Tools {

    protected String name;
    protected double price;


    static {
        System.out.println("The Tool class has been loaded into memory.");
    }


    {
        System.out.println("A new instrument has been created.");
    }

    public Tools(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void touch();
}
