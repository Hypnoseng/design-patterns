package abstractfactory.factory;

import abstractfactory.product.astronaut.Astronaut;
import abstractfactory.product.astronaut.SpaceXAstronaut;
import abstractfactory.product.controlSystem.ControlSystem;
import abstractfactory.product.controlSystem.SpaceXControlSystem;
import abstractfactory.product.rocket.Rocket;
import abstractfactory.product.rocket.SpaceXRocket;

public class SpaceXFactory implements SpaceAgencyFactory{
    @Override
    public Rocket createRocket() {
        return new SpaceXRocket();
    }

    @Override
    public Astronaut createAstronaut() {
        return new SpaceXAstronaut();
    }

    @Override
    public ControlSystem createControlSystem() {
        return new SpaceXControlSystem();
    }
}
