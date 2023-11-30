package com.scaler.EcomProductService.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class ProductRequestDTO {
    private String title;
    private double price;
    private String category;
    private String description;
    private String image;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRequestDTO that = (ProductRequestDTO) o;
        return Double.compare(price, that.price) == 0 && Objects.equals(title, that.title) && Objects.equals(category, that.category) && Objects.equals(description, that.description) && Objects.equals(image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, category, description, image);
    }
}
