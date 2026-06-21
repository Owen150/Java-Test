public class Robot {
    private static int robotCount = 0;
    private String name;

    //Constructor
    public Robot(){
        robotCount++;
        randomName();
    }

    public void randomName() {
        int randomNum = (int) (Math.random() * 3 + 1);

        if (randomNum == 1)
            name = "Michael";
        else if (randomNum == 2)
            name = "Owen";
        else
            name = "Tyap";
    }
}
