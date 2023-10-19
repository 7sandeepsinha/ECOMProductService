package com.scaler.EcomProductService.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
public class Product {
    private int id;
    private String title;
    private double price;
    private String category;
    private String description;
    private String image;
}
