public class AeroplaneConstructor extends VehicleConstructor{
    private boolean hasJetEngines;

    public AeroplaneConstructor(){
        super("Red", 1);
        hasJetEngines = false;
    }

    public AeroplaneConstructor(boolean isJetPlane){
        super("Pink", 22);
        hasJetEngines = isJetPlane;
    }

}
