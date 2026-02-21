package abstractfactory.product.controlSystem;

public class IsroControlSystem extends ControlSystem{
    @Override
    public String monitor() {
        return "Indian Space Research Organisation Control System tracking mission.";
    }
}
