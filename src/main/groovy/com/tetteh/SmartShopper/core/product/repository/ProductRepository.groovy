package com.tetteh.SmartShopper.core.product.repository

import com.tetteh.SmartShopper.core.entity.ProductsEntity
import org.springframework.data.jpa.repository.JpaRepository


interface ProductRepository extends JpaRepository<ProductsEntity,Integer> {

}