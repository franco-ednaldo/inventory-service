package com.example.inventory.application.ports.in;

import com.example.inventory.application.core.domain.Inventory;

public interface FindInventoryByProductIdInputPort {
    Inventory find(Integer productId);
}
