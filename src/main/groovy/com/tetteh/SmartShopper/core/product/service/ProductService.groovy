package com.tetteh.SmartShopper.core.product.service

import com.tetteh.SmartShopper.core.product.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductService {
    private final ProductRepository productRepository

    @Autowired
    ProductService(ProductRepository productRepository){
        this.productRepository = productRepository
    }
}
