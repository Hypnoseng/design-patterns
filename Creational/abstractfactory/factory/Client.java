package abstractfactory.factory;

import abstractfactory.product.astronaut.Astronaut;
import abstractfactory.product.controlSystem.ControlSystem;
import abstractfactory.product.rocket.Rocket;

public class Client {
    private SpaceAgencyFactory factory;
    private Rocket rocket;
    private Astronaut astronaut;
    private ControlSystem controlSystem;

    public Client(SpaceAgencyFactory factory){
        this.factory = factory;
    }

    public void executeMission(){
        rocket = factory.createRocket();
        astronaut = factory.createAstronaut();
        controlSystem = factory.createControlSystem();

        System.out.println("-----Create Mission Components-----");
        System.out.println(astronaut.train());
        System.out.println(rocket.launch());
        System.out.println(controlSystem.monitor());
        System.out.println("-----let go!!-----\n");
    }
}
