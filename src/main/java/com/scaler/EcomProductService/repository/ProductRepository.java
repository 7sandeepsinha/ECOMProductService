package com.scaler.EcomProductService.repository;

import com.scaler.EcomProductService.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
    Product findByTitle(String title);
    Product findByTitleAndDescription(String title, String description); // select * from Product where title = ? and description = ?
    Product findByTitleOrDescription(String title, String description); // select * from Product where title = ? or description = ?
    Product findByPriceLessThanEqual(double price); // <= price
    Product findByPriceLessThan(double price); // < price
    Product findByPriceGreaterThanEqual(double price); // >= price
    Product findByPriceGreaterThan(double price); // > price
    Product findByPriceBetweenStartPriceAndEndPrice(double startPrice, double endPrice);

    // custom SQL queries can also be done in JPA
}
