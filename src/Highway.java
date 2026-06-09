public class Highway {
    public static void main(String[] args){
        Car fordMustang = new Car();
        SelfDrivingCar kitt = new SelfDrivingCar();
        fordMustang.applyBrakes(); //Driver Applies Brakes & Driver Checks Surroundings
        //By Default Java uses the most recently overridden version of a method based on the object type.
        kitt.emergencyOverride();
    }
}
