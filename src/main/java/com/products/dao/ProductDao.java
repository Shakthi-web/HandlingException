package com.products.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.products.entity.Product;
import com.products.repository.ProductRepository;
@Repository
public class ProductDao {
@Autowired
ProductRepository pr;
	public String setProduct(Product p) {
		pr.save(p);
		return "Saved";
	}
	public String setAllProduct(List<Product> p) {
		pr.saveAll(p);
		return "Successfully Saved";
	}
	public List<Product> getAllProduct() {
		return pr.findAll();
	}
	public Product getbyId(int x) {
		return pr.findById(x).get();
	}
	public List<Product> getbyName(@PathVariable String o){
		return pr.getbyName(o);
	}
}
