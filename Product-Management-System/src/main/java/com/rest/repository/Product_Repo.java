package com.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.model.Products;

public interface Product_Repo extends JpaRepository<Products, Integer> {

}
