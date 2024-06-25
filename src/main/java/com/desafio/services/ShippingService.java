package com.desafio.services;

import com.desafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){

        double valorprod= order.getBasic();

        if( valorprod<100){
            return 20.0;
        }
        else if(valorprod>100 && valorprod<=200){
            return 12.0;
        }
        else{
            return 0;
        }


    }

}
