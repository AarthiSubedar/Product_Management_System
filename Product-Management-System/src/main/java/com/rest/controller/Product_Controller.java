package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Products;
import com.rest.service.Product_Service_Imp;


@RestController
@CrossOrigin("*")
public class Product_Controller {
	
@Autowired
private Product_Service_Imp service;
	
@PostMapping("/saveProduct")
public ResponseEntity<?> saveProduct(@RequestBody Products products) {
	return new ResponseEntity<>(service.saveProduct(products),HttpStatus.CREATED);
	
}

@GetMapping("/")
public ResponseEntity<?> getAllProduct(){
	return new ResponseEntity<>(service.getAllProduct(),HttpStatus.OK);
	
}

@GetMapping("/{id}")
public ResponseEntity<?> getProductById(@PathVariable Integer id){
	return new ResponseEntity<>(service.getProductById(id),HttpStatus.OK);
	
}

@GetMapping("/deleteProduct/{id}")
public ResponseEntity<?> deleteProduct(@PathVariable Integer id){
	return new ResponseEntity<>(service.deleteProduct(id),HttpStatus.OK);	
}

@PostMapping("/editProduct/{id}")
public ResponseEntity<?> editProduct(@RequestBody Products products,@PathVariable Integer id){
	return new ResponseEntity<>(service.editProduct(products, id),HttpStatus.CREATED) ;	
}

}
















