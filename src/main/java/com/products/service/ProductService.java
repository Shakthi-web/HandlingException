package com.products.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.ProductNotFoundException;
import com.products.dao.ProductDao;
import com.products.entity.Product;
@Service
public class ProductService {
@Autowired
ProductDao pd;
	public String setProduct(Product p) {
		return pd.setProduct(p) ;
	}
	public String setAllProduct(List<Product> p) {
		return pd.setAllProduct(p);
	}
	public List<Product> getAllProduct() {
		return pd.getAllProduct();
	}
	public Product getbyId(int x) {
		return pd.getbyId(x);
	}
	public List<Product> getbyName(String o) throws ProductNotFoundException{
//		List<Product> hi=getAllProduct().stream().filter(x->x.getBrand().equals(o)).toList();
//		if(hi.isEmpty()) {
//			throw new ProductNotFoundException("");
//		}
//		else {
			if(pd.getbyName(o).isEmpty()) {
				throw new ProductNotFoundException("Product is not available");
			}
			else {
				 return pd.getbyName(o);
			}
			
		}
	}


