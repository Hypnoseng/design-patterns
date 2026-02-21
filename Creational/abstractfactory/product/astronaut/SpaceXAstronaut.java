package abstractfactory.product.astronaut;

public class SpaceXAstronaut extends Astronaut{
    @Override
    public String train() {
        return "SpaceX Astronaut preparing for Mars.";
    }
}
