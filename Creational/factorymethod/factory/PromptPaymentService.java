package factorymethod.factory;

import factorymethod.payment.Payment;
import factorymethod.payment.PromptPayment;

public class PromptPaymentService extends OrderService{

    @Override
    public Payment paySeverice() {
        return new PromptPayment();
    }
}
