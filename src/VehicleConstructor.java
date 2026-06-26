public class VehicleConstructor {
    private String color;
    private int vin;

    public VehicleConstructor(){
        super(); //Call to the Java Object class. Constructs a New Object.
    }

    public VehicleConstructor(String newColor){
        this(); //Call to the same VehicleConstructor inside the same class but with no parameters i.e.VehicleConstructor() which calls super i.e. The Java Object class
        color = newColor;
    }

    public VehicleConstructor(String newColor, int newVin){
        super(); //Call to the Java Object Class. Constructs a new Object.
        color = newColor;
        vin = newVin;
    }
}
