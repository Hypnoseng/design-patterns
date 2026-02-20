package factorymethod.payment;

public interface Payment {
    String prepare();
    String pay();
    String receipt();
}
