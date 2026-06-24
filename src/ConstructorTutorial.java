public class ConstructorTutorial {
    private static int constructorCount = 0; //Static Variable - Shared among all objects of a class. Memory Efficiency (Don't need to redeclare similar variables) + Counters/Constants.
    private String constructorName;

    //Constructor - Sets up and constructs the data in a new object after creation/initialization.
    //A Constructor behaves much like a non-static method i.e. Cannot be called without using an individual object as a reference.
    public ConstructorTutorial(){
        //Every time we create a new object constructorCount increases by 1. We can use the value of constructorCount++ to keep track of how many ConstructorTutorial objects have been created.
        constructorCount++;
        randomName();
    }

    public void randomName() {
        //Implicit Casting - Double to Integer. Generates a random number between 1 and 3.
        //Java sees all decimal numbers as doubles. If Float, add F.
        //Java sees all other numbers as integers. If Long, add L.
        int randomNum = (int) (Math.random() * 3 + 1);

        if (randomNum == 1)
            constructorName = "Michael";
        else if (randomNum == 2)
            constructorName = "Owen";
        else
            constructorName = "Tyap";
    }

    public void getConstructorName() {
        System.out.println(constructorName);
        //System.out.println(constructorCount);
    }

    //Static Method - Can be called without using an individual object as a reference. Usage - Accessing Static Data i.e. constructorCount
    public static void getConstructorCount() {
        System.out.println(constructorCount);
    }
}
