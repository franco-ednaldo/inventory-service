package com.example.inventory.adapters.out;

import com.example.inventory.application.core.domain.Sale;
import com.example.inventory.application.core.domain.enums.SaleEvent;
import com.example.inventory.application.ports.out.SendUpdateInventoryOutputPort;
import org.springframework.stereotype.Component;

@Component
public class SendUpdateInventoryAdapter implements SendUpdateInventoryOutputPort {
    @Override
    public void send(Sale sale, SaleEvent event) {

    }
}
