package abstractfactory;

import abstractfactory.factory.*;


public class Main {
    public static void main(String[] args){
        SpaceAgencyFactory factory = new NasaFactory();
        Client client = new Client(factory);
        client.executeMission();

        factory = new SpaceXFactory();
        client = new Client(factory);
        client.executeMission();

        factory = new IsroFactory();
        client = new Client(factory);
        client.executeMission();
    }
}
