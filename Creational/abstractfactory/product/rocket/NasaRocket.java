package abstractfactory.product.rocket;

public class NasaRocket extends Rocket{
    @Override
    public String launch() {
        return "NASA Rocket launching with precision.";
    }
}
