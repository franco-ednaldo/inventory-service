package com.example.inventory.adapters.out.message;

import com.example.inventory.application.core.domain.Sale;
import com.example.inventory.application.core.domain.enums.SaleEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleMessage {
    private Sale sale;

    private SaleEvent saleEvent;
}
