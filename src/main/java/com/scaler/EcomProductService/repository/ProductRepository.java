package com.scaler.EcomProductService.repository;

import com.scaler.EcomProductService.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
    Product findByTitle(String title);
    Product findByTitleAndDescription(String title, String description); // select * from Product where title = ? and description = ?
    Product findByTitleOrDescription(String title, String description); // select * from Product where title = ? or description = ?

    @Query(value = CustomQueries.FIND_PRODUCT_BY_TITLE, nativeQuery = true)
    Product findProductByTitleLike(String title);

    @Query(value = "select * from Products", nativeQuery = true)
    Product findAllProducts(String title, UUID id);

    // custom SQL queries can also be done in JPA
}
// HW -> findByPrice_Amount
// Execute the custom queries

//Sat EOD -> update this code with basic APIs and repositories for other entities