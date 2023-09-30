package com.tetteh.SmartShopper.core.entity

import com.tetteh.SmartShopper.core.product.model.Products

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "products")
class ProductsEntity {
    @Id
    Integer id

    @Column(name="food_name")
    String foodName

    @Column(name="food_code")
    String foodCode

    @OneToOne
    CategoriesEntity categoriesEntity

    Products toResponseModel() {
        new Products(
                id: id,
                foodName: foodName,
                foodCode: foodCode,
                catergory: categoriesEntity.category
        )
    }

}
