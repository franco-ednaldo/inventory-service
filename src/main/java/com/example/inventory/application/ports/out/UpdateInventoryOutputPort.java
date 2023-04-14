package com.example.inventory.application.ports.out;

import com.example.inventory.application.core.domain.Inventory;

public interface UpdateInventoryOutputPort {

    void update(Inventory inventory);
}
