package factorymethod.payment;

public class PromptPayment implements Payment {
    @Override
    public String prepare() {
        return "Preparing PromptPay card payment....";
    }

    @Override
    public String pay() {
        return "Paying with PromptPay...";
    }

    @Override
    public String receipt() {
        return "PromptPay receipt generated.";
    }
}
