package com.example.inventory.application.ports.out;

import com.example.inventory.application.core.domain.Inventory;

import java.util.Optional;

public interface FindInventoryByProductIdOutputPort {
    Optional<Inventory> find(Integer productId);
}
