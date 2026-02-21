package abstractfactory.factory;

import abstractfactory.product.astronaut.Astronaut;
import abstractfactory.product.controlSystem.ControlSystem;
import abstractfactory.product.rocket.Rocket;

public interface SpaceAgencyFactory {
    Rocket createRocket();
    Astronaut createAstronaut();
    ControlSystem createControlSystem();
}
