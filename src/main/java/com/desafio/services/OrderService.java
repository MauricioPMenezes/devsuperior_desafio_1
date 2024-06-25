package com.desafio.services;

import com.desafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService=new ShippingService();

    public double total(Order order){
        double frete = shippingService.shipment(order);

        if(order.getDiscount()==0){
            return  frete + order.getBasic();
        }
        else {
            return frete +(order.getBasic() - (order.getBasic() * (order.getDiscount() / 100)));
        }
    }

}
