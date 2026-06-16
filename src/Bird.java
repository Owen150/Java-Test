public class Bird extends Animal{
    public void reportStats(){
        String featherColor = "Red";
        System.out.println("Feather Color " + featherColor);
        System.out.println("Legs " + getNumOfLegs());
    }
}
