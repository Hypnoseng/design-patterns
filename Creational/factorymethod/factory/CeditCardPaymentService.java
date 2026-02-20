package factorymethod.factory;

import factorymethod.payment.CreditCardPayment;
import factorymethod.payment.Payment;

public class CeditCardPaymentService extends OrderService{
    @Override
    public Payment paySeverice() {
        return new CreditCardPayment();
    }
}
