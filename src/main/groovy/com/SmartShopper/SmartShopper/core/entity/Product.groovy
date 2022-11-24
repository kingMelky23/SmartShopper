package com.SmartShopper.SmartShopper.core.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.SequenceGenerator
import javax.persistence.Table

@Entity
@Table(name = 'product')
class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = 'product_id_seq')
    @SequenceGenerator(name = 'product_id_seq', sequenceName = 'product_id_seq', allocationSize = 20)
    Long id

    String name
    String description

}
