package com.naw.repositories;

import java.util.List;

import com.naw.entities.Product;

public interface ProductRepository {

	public List<Product> findAll();

	public Product find();

	public void create(Product product);

	public void update(Product product);

	public void delete(Product product);

}
