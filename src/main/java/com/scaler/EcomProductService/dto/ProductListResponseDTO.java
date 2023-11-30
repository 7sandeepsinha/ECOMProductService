package com.scaler.EcomProductService.dto;

import com.scaler.EcomProductService.model.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ProductListResponseDTO {
    private List<ProductResponseDTO> products;

    public ProductListResponseDTO() {
        this.products = new ArrayList<>();
    }
}

/*
        {
            "products":[]
        }
 */
