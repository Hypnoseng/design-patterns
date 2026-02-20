package Creational.factorymethod.factory;

import Creational.factorymethod.payment.PayPalPayment;
import Creational.factorymethod.payment.Payment;

public class PayPalPaymentService extends OrderService{
    @Override
    public Payment paySeverice() {
        return new PayPalPayment();
    }
}
