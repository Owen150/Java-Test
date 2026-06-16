public class Bird extends Animal{
    private String featherColor = "red";
    private void reportStats(){
        System.out.println("Feather Color" + featherColor);
        System.out.println("Legs" + getNumOfLegs());
    }
}
