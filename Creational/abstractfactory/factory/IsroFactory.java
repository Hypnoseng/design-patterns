package abstractfactory.factory;

import abstractfactory.product.astronaut.Astronaut;
import abstractfactory.product.astronaut.IsroAstronaut;
import abstractfactory.product.controlSystem.ControlSystem;
import abstractfactory.product.controlSystem.IsroControlSystem;
import abstractfactory.product.rocket.IsroRocket;
import abstractfactory.product.rocket.Rocket;

public class IsroFactory implements SpaceAgencyFactory{
    @Override
    public Rocket createRocket() {
        return new IsroRocket();
    }

    @Override
    public Astronaut createAstronaut() {
        return new IsroAstronaut();
    }

    @Override
    public ControlSystem createControlSystem() {
        return new IsroControlSystem();
    }
}
