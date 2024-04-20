package com.rest.service;

import java.util.List;

import com.rest.model.Products;

public interface Product_Service {

	public Products saveProduct(Products products);

	public List<Products> getAllProduct();

	public Products getProductById(Integer id);

	public String deleteProduct(Integer id);

	public Products editProduct(Products products,Integer id);
}
