package com.scaler.EcomProductService.service;

import com.scaler.EcomProductService.dto.ProductListResponseDTO;
import com.scaler.EcomProductService.dto.ProductRequestDTO;
import com.scaler.EcomProductService.dto.ProductResponseDTO;
import com.scaler.EcomProductService.exception.ProductNotFoundException;
import com.scaler.EcomProductService.model.Product;

import java.util.List;

public interface ProductService {
    ProductListResponseDTO getAllProducts() throws Exception;

    ProductResponseDTO getProductById(int id) throws ProductNotFoundException;
    ProductResponseDTO createProduct(ProductRequestDTO productRequestDTO);
    boolean deleteProduct(int id);
    Product updateProduct(int id, Product updatedProduct);
    ProductResponseDTO findProductByTitle(String title) throws ProductNotFoundException;
}
