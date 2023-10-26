package com.scaler.EcomProductService.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FakeStoreProductRequestDTO {
    private String title;
    private double price;
    private String category;
    private String description;
    private String image;
}
