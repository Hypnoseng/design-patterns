package factorymethod.factory;

import factorymethod.payment.Payment;

public abstract class OrderService {

    public abstract Payment paySeverice();

    public String processOrder(){
        StringBuilder result = new StringBuilder("---------Processing---------\n");

        Payment payment = paySeverice();
        result.append(payment.prepare()).append("\n");
        result.append(payment.pay()).append("\n");
        result.append(payment.receipt()).append("\n");

        return result.toString();
    }
}
