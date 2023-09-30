package com.tetteh.SmartShopper.core.entity

import com.tetteh.SmartShopper.core.category.model.Category

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = 'categories')
class CategoriesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //we use generateType.Identity is for when out DB column used auto increment https://www.youtube.com/watch?v=n_tc6Nc4tfI&ab_channel=JavaGuides
    Long id

    @Column(name="category_name")
    String name



}
