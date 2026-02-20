package factorymethod.payment;

public class PayPalPayment implements Payment {
    @Override
    public String prepare() {
        return "Preparing PayPal payment....";
    }

    @Override
    public String pay() {
        return "Paying with PayPal card...";
    }

    @Override
    public String receipt() {
        return "PayPa receipt generated.";
    }
}
