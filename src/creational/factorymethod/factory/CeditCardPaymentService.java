package Creational.factorymethod.factory;

import Creational.factorymethod.payment.CreditCardPayment;
import Creational.factorymethod.payment.Payment;

public class CeditCardPaymentService extends OrderService{
    @Override
    public Payment paySeverice() {
        return new CreditCardPayment();
    }
}
