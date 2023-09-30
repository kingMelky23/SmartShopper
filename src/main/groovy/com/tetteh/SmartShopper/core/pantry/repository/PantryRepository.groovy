package com.tetteh.SmartShopper.core.pantry.repository

import com.tetteh.SmartShopper.core.entity.PantryEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PantryRepository extends JpaRepository<PantryEntity,Integer>{

}