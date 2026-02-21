package abstractfactory.product.controlSystem;

public class NasaControlSystem extends ControlSystem{
    @Override
    public String monitor() {
        return "NASA Control System monitoring mission.";
    }
}
