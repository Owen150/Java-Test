public class SelfDrivingCar extends Car{
    @Override
    public void applyBrakes(){
        System.out.println("Computer Applies Brakes");
    }

    @Override
    public void checkSurroundings(){
        System.out.println("Computer Checks Surrounding");
    }

    public void emergencyOverride(){
        System.out.println("Driver Takes Control");
        super.applyBrakes();
    }
}
