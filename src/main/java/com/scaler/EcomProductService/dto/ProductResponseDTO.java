package com.scaler.EcomProductService.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDTO {
    private int id;
    private String title;
    private double price;
    private String category;
    private String description;
    private String image;
}
