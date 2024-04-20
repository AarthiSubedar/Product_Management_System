package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Products;
import com.rest.repository.Product_Repo;

@Service
public class Product_Service_Imp implements Product_Service {

	@Autowired
	private Product_Repo repo;
	
	@Override
	public Products saveProduct(Products products) {
		
		return repo.save(products);
	}

	@Override
	public List<Products> getAllProduct() {
		
		return repo.findAll();
	}

	@Override
	public Products getProductById(Integer id) {
		
		return repo.findById(id).get();
	}

	@Override
	public String deleteProduct(Integer id) {
		
		Products products=repo.findById(id).get();
		
		if(products !=null) {
			repo.delete(products);
			return "product deleted succesfully...";
		}
		return "something wrong on server";
	}

	@Override
	public Products editProduct(Products products, Integer id) {
		Products oldproduct=repo.findById(id).get();
		
		oldproduct.setProductName(products.getProductName());
		oldproduct.setDescription(products.getDescription());
		oldproduct.setPrice(products.getPrice());
		oldproduct.setStatus(products.getStatus());
		
		return repo.save(oldproduct);
	}

}
