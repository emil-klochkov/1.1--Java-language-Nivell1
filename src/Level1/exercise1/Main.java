package Level1.exercise1;

public class Main {
    public static void main(String[] args) {


        System.out.println("Accessing a static member of the Wind class..");
        System.out.println(Wind_tools.class.getName());


        System.out.println("\nCreating an object with class Wind...");
        Wind_tools flute = new Wind_tools("Flute", 120.0);
        flute.touch();


        System.out.println("\nCreating an object with class String...");
        String_tools guitar = new String_tools("Guitar", 300.0);
        guitar.touch();


        System.out.println("\nCreating an object with class Percussion...");
        Percussion_tools Drum = new Percussion_tools("Drum", 80.0);
        Drum.touch();

    }
}