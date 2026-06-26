public class Slimer extends GhostConstructor{
    private boolean isHungry;

    //Passing data to a Superclss Constructor.
    public Slimer(boolean isHungry, boolean isScary) {
        super("Green", isScary);
        this.isHungry = isHungry;
    }
}
