public class Slimer extends GhostConstructor{
    private boolean isHungry;

    //Passing data to a Superclass Constructor i.e. GhostConstructor
    public Slimer(boolean isHungry, boolean isScary) {
        super("Green", isScary); //Creates a New GhostConstructor Object
        this.isHungry = isHungry;
    }
}
