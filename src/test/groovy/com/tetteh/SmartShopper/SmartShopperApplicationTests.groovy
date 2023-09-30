package com.tetteh.SmartShopper

import com.tetteh.SmartShopper.core.entity.PantryEntity
import com.tetteh.SmartShopper.core.entity.ProductsEntity
import com.tetteh.SmartShopper.core.pantry.repository.PantryRepository
import com.tetteh.SmartShopper.core.product.repository.ProductRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SmartShopperApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	PantryRepository pantryRepository

	@Autowired
	ProductRepository productRepository

//	@Autowired
//	ProductsRepository repository
//
//	@Test
//	void testCreat() {
//		ProductsEntity product = new ProductsEntity()
//		product.setId(1)
//		product.setName("test")
//		product.setDescription("we are testing")
//		product.setPrice(1000d)
//		repository.save(product)
//	}


	@Test
	void createTest() {
		ProductsEntity product = productRepository
	}

}
