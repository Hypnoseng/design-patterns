package factorymethod.payment;

public class CreditCardPayment implements Payment{
    @Override
    public String prepare() {
        return "Preparing Credit card payment....";
    }

    @Override
    public String pay() {
        return "Paying with Credit card...";
    }

    @Override
    public String receipt() {
        return "Credit card receipt generated.";
    }
}
