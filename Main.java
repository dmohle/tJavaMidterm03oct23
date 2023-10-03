import java.util.Date;


public class Main {
    public static void main(String[] args) {

        System.out.printf("\n\nWelcome to my Zoo!\n\n");
        Animal myAnimal = new Animal();
        Animal mySecondAnimal = new Animal("some name", "hyena");

        String aName = mySecondAnimal.name;
        System.out.println("\n the animal name is: " + aName);

        // Create a hyena
        Hyena myHyena = new Hyena();

        // Look at the new Hyena object
        System.out.println("\n The hyena name is: " + myHyena.name);

        // Create a hyena with a name and a species
        Hyena aNewHyena = new Hyena("Zig","hyena");

        System.out.println(" \n the name of my hyena is: " + aNewHyena.name);



    }
}