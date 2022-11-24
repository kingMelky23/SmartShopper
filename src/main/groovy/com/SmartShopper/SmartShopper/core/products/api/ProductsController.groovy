package com.SmartShopper.SmartShopper.core.products.api

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import org.springframework.web.multipart.MultipartFile

@RestController // used to expose rest API
class ProductsController {

    @Autowired
    ProductsController(){}

    @GetMapping(value = "")
    private List getProductsFromWiki(@RequestParam URI uri){

        RestTemplate restTemplate = new RestTemplate()
        List results = restTemplate.getForObject(uri,List)
        return results
    }
}
