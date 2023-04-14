package com.example.inventory.adapters.out;

import com.example.inventory.adapters.repository.InventoryRepository;
import com.example.inventory.adapters.repository.mapper.InventoryEntityMapper;
import com.example.inventory.application.core.domain.Inventory;
import com.example.inventory.application.ports.out.UpdateInventoryOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UpdateInventoryAdapter implements UpdateInventoryOutputPort {

    private final InventoryRepository repository;

    private final InventoryEntityMapper mapper;

    @Override
    public void update(Inventory inventory) {
        final var inventoryEntity = this.mapper.toInventoryEntity(inventory);
        this.repository.save(inventoryEntity);
    }
}
