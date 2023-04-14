package com.example.inventory.adapters.repository.mapper;

import com.example.inventory.adapters.repository.entity.InventoryEntity;
import com.example.inventory.application.core.domain.Inventory;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InventoryEntityMapper {

    Inventory toInventory(InventoryEntity inventoryEntity);

    InventoryEntity toInventoryEntity(Inventory inventory);
}
