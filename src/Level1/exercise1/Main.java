package Level1.exercise1;

public class Main {
    public static void main(String[] args) {


        System.out.println("Accessing a static member of the Wind class..");
        System.out.println(Wind_instruments.class.getName());


        System.out.println("\nCreating an object with class Wind...");
        Wind_instruments flute = new Wind_instruments("Flute", 120.0);
        flute.play();


        System.out.println("\nCreating an object with class String...");
        String_instruments guitar = new String_instruments("Guitar", 300.0);
        guitar.play();


        System.out.println("\nCreating an object with class Percussion...");
        Percussion_instruments drum = new Percussion_instruments("Drum", 80.0);
        drum.play();

    }
}