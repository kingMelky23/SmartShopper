package com.tetteh.SmartShopper.core.pantry.service

import com.tetteh.SmartShopper.core.entity.PantryEntity
import com.tetteh.SmartShopper.core.pantry.model.Pantry
import com.tetteh.SmartShopper.core.pantry.repository.PantryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import javax.transaction.Transactional

@Service
class PantryService {
    private final PantryRepository pantryRepository

    @Autowired
    PantryService(PantryRepository pantryRepository){
        this.pantryRepository = pantryRepository
    }

    @Transactional
    Pantry getPantryById(int id) {
        return pantryRepository.getReferenceById(id).toResponseModel()
    }


    static void createPantry(String name, int ownerId) {
        Pantry pantry = new Pantry(pantryName: name, ownerId: ownerId)
    }

}
