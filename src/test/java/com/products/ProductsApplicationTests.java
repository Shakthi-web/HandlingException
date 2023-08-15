package com.products;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.products.controller.ProductController;

@SpringBootTest
class ProductsApplicationTests {

	@Test
	void contextLoads() {
	}

	
	@Autowired
	ProductController pc;
	@Test
	public void getall() {
		assertNotNull(pc.getAllProduct());
	}
}
