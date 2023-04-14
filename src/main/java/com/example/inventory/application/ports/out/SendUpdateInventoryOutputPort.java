package com.example.inventory.application.ports.out;

import com.example.inventory.application.core.domain.Sale;
import com.example.inventory.application.core.domain.enums.SaleEvent;

public interface SendUpdateInventoryOutputPort {
    void send(Sale sale, SaleEvent event);
}
