package com.example.inventory.application.core.usecase;

import com.example.inventory.application.core.domain.Sale;
import com.example.inventory.application.core.domain.enums.SaleEvent;
import com.example.inventory.application.ports.in.FindInventoryByProductIdInputPort;
import com.example.inventory.application.ports.out.SendUpdateInventoryOutputPort;
import com.example.inventory.application.ports.out.UpdateInventoryOutputPort;

public class DebitInventoryUseCase {
    private final FindInventoryByProductIdInputPort findInventoryByProductIdInputPort;
    private final UpdateInventoryOutputPort updateInventoryOutputPort;

    private final SendUpdateInventoryOutputPort sendUpdateInventoryOutputPort;

    public DebitInventoryUseCase(FindInventoryByProductIdInputPort findInventoryByProductIdInputPort,
                                 UpdateInventoryOutputPort updateInventoryOutputPort,
                                 SendUpdateInventoryOutputPort sendUpdateInventoryOutputPort) {
        this.findInventoryByProductIdInputPort = findInventoryByProductIdInputPort;
        this.updateInventoryOutputPort = updateInventoryOutputPort;
        this.sendUpdateInventoryOutputPort = sendUpdateInventoryOutputPort;
    }

    public void debit(final Sale sale) {
        var inventory = this.findInventoryByProductIdInputPort.find(sale.getProductId());
        if (inventory.getQuantity() < sale.getQuantity()) {
            throw new RuntimeException("Estoque insuficiente!");
        }
        inventory.debitQuantity(sale.getQuantity());
        this.updateInventoryOutputPort.update(inventory);
        this.sendUpdateInventoryOutputPort.send(sale, SaleEvent.UPDATE_INVENTORY);

    }
}
