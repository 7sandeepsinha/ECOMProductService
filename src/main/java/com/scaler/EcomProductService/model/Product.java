package com.scaler.EcomProductService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Product extends BaseModel{
    private String title;
    private String description;
    private String image;
    @OneToOne
    private Price price;
    @ManyToOne
    private Category category;
}
/*
    Product - Category : M : 1
    1         1
    M         1
    M         1

    Category
        List<Product>

    Product
        Category

    1 > M
 */