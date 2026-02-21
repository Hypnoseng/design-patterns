package abstractfactory.product.rocket;

public class SpaceXRocket extends Rocket{
    @Override
    public String launch() {
        return "SpaceX Falcon rocket launching!";
    }
}
