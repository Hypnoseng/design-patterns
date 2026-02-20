package Creational.factorymethod.factory;

import Creational.factorymethod.payment.Payment;
import Creational.factorymethod.payment.PromptPayment;

public class PromptPaymentService extends OrderService{

    @Override
    public Payment paySeverice() {
        return new PromptPayment();
    }
}
