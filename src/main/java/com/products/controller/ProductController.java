package com.products.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.ProductNotFoundException;
import com.products.entity.Product;
import com.products.service.ProductService;

@RestController
@RequestMapping("/pro")
public class ProductController {
	@Autowired
	ProductService ps;
@PostMapping("/setProduct")
public String setProduct(@RequestBody Product p) {
	return ps.setProduct(p);
}
@PostMapping("/setAllProduct")
public String setAllProduct(@RequestBody List<Product> p) {
	return ps.setAllProduct(p);
}
@GetMapping(path="/getAllProduct")
public List<Product> getAllProduct(){
	return ps.getAllProduct();
}
@GetMapping(path="/getbyId/{x}")
public Product getbyId(@PathVariable int x){
	return ps.getbyId(x);
}
@GetMapping(path="/getString")
public String getString() {
	return "Hello";
}
@GetMapping("/getbyName/{o}")
public List<Product> getbyName(@PathVariable String o) throws ProductNotFoundException{
	return ps.getbyName(o);
}
}

