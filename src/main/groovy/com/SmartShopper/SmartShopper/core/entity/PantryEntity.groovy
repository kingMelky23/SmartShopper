package com.SmartShopper.SmartShopper.core.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToMany
import javax.persistence.SequenceGenerator
import javax.persistence.Table

@Entity
@Table(name = 'pantry')
class PantryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = 'pantry_id_seq')
    @SequenceGenerator(name = 'pantry_id_seq', sequenceName = 'pantry_id_seq', allocationSize = 20)
    Long id

    @ManyToMany
    List <UserEntity> users = []

    @ManyToMany
    List <Product> products = []





}
