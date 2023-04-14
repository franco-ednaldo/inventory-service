package com.example.inventory.adapters.out;

import com.example.inventory.adapters.repository.InventoryRepository;
import com.example.inventory.adapters.repository.mapper.InventoryEntityMapper;
import com.example.inventory.application.core.domain.Inventory;
import com.example.inventory.application.ports.out.FindInventoryByProductIdOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class FindInventoryByProductIdAdapter implements FindInventoryByProductIdOutputPort {

    private final InventoryRepository repository;

    private final InventoryEntityMapper mapper;

    @Override
    public Optional<Inventory> find(Integer productId) {
        var inventoryEntity = this.repository.findByProductId(productId);
        return inventoryEntity.map(mapper::toInventory);
    }
}
