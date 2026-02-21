package abstractfactory.factory;

import abstractfactory.product.astronaut.Astronaut;
import abstractfactory.product.astronaut.NasaAstronaut;
import abstractfactory.product.controlSystem.ControlSystem;
import abstractfactory.product.controlSystem.NasaControlSystem;
import abstractfactory.product.rocket.NasaRocket;
import abstractfactory.product.rocket.Rocket;

public class NasaFactory implements SpaceAgencyFactory{
    @Override
    public Rocket createRocket() {
        return new NasaRocket();
    }

    @Override
    public Astronaut createAstronaut() {
        return new NasaAstronaut();
    }

    @Override
    public ControlSystem createControlSystem() {
        return new NasaControlSystem();
    }
}
