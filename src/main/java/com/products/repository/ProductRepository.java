package com.products.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import com.products.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	@Query(value="select *from prod_details where brand like ?",nativeQuery=true)
	List<Product> getbyName(String o);
	
}
