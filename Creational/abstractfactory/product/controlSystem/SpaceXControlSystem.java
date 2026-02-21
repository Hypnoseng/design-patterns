package abstractfactory.product.controlSystem;

public class SpaceXControlSystem extends ControlSystem{
    @Override
    public String monitor() {
        return "SpaceX AI control system active.";
    }
}
