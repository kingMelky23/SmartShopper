package com.tetteh.SmartShopper.core.entity

import com.tetteh.SmartShopper.core.pantry.model.Pantry
import com.tetteh.SmartShopper.core.product.model.Products

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToMany

import javax.persistence.Table

@Entity
@Table(name = "pantry")
class PantryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //we use generateType.Identity is for when out DB column used auto increment https://www.youtube.com/watch?v=n_tc6Nc4tfI&ab_channel=JavaGuides
    Integer id

    @Column(name="pantry_name")
    String pantryName

    @Column(name = "owner_id")
    Integer ownerId

    @ManyToMany //cascade type?
    List<UserEntity> users = []

    @ManyToMany
    List<ProductsEntity> products = []

    Pantry toResponseModel() {
        new Pantry(
                id: id,
                pantryName: pantryName,
                ownerId: ownerId
        )
    }

}
