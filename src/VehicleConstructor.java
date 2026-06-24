public class VehicleConstructor {
    private String color;
    private int vin;

    public VehicleConstructor(){
        super();
    }

    public VehicleConstructor(String newColor){
        this();
        color = newColor;
    }

    public VehicleConstructor(String newColor, int newVin){
        super();
        color = newColor;
        vin = newVin;
    }
}
