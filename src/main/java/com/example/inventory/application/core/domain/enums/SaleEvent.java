package com.example.inventory.application.core.domain.enums;

public enum SaleEvent {
    CREATED_SALE,
    UPDATE_INVENTORY,

    VALIDATED_PAYMENT,

    ROLLBACK_INVENTORY,

    FAILED_PAYMENT
}