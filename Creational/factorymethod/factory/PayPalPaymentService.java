package factorymethod.factory;

import factorymethod.payment.PayPalPayment;
import factorymethod.payment.Payment;

public class PayPalPaymentService extends OrderService{
    @Override
    public Payment paySeverice() {
        return new PayPalPayment();
    }
}
