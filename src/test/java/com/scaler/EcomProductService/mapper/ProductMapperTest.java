package com.scaler.EcomProductService.mapper;

import com.scaler.EcomProductService.dto.ProductListResponseDTO;
import com.scaler.EcomProductService.dto.ProductResponseDTO;
import com.scaler.EcomProductService.model.Category;
import com.scaler.EcomProductService.model.Price;
import com.scaler.EcomProductService.model.Product;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ProductMapperTest {
    @Test
    public void testConvertProductsToProductListResponseDTO() {
        // Arrange
        Category category = new Category();
        category.setCategoryName("Electronics");

        Price price = new Price();
        price.setAmount(1000);
        price.setDiscount(0);
        price.setCurrency("Rs");

        Product product1 = new Product();
        product1.setTitle("Laptop");
        product1.setDescription("Best laptop");
        product1.setImage("someImageUrl");
        product1.setCategory(category);
        product1.setPrice(price);

        Product product2 = new Product();
        product2.setTitle("Mobile");
        product2.setDescription("Best phone");
        product2.setImage("someImageUrl");
        product2.setCategory(category);
        product2.setPrice(price);

        List<Product> products = Arrays.asList(product1, product2);

        // Act
        ProductListResponseDTO productListResponseDTO = ProductMapper.convertProductsToProductListResponseDTO(products);

        // Assert
        Assertions.assertNotNull(productListResponseDTO);
        Assertions.assertEquals(2, productListResponseDTO.getProducts().size());

        ProductResponseDTO responseDTO1 = productListResponseDTO.getProducts().get(0);
        Assertions.assertEquals(product1.getTitle(), responseDTO1.getTitle());
        Assertions.assertEquals(product1.getDescription(), responseDTO1.getDescription());
    }
}
