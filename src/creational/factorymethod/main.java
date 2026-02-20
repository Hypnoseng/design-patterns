package Creational.factorymethod;

import Creational.factorymethod.factory.*;

public class Main {

    public static void client(OrderService orderService){//
        System.out.println(orderService.processOrder());
    }
    public static void main(String[] args){
        OrderService order = new CeditCardPaymentService();
        client(order);

        order = new PromptPaymentService();
        client(order);

        order = new PayPalPaymentService();
        client(order);
    }
}
