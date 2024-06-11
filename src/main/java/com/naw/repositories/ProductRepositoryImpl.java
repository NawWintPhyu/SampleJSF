package com.naw.repositories;

import java.util.ArrayList;
import java.util.List;

import com.naw.entities.Product;

public class ProductRepositoryImpl implements ProductRepository {

	@Override
	public List<Product> findAll() {
		List<Product> productList = new ArrayList<Product>();
		Product product = new Product();
		product.setId("p1");
		product.setName("KFC");
		product.setPrice(3400.9);
		product.setQuantity(10);
		product.setStatus(true);
		productList.add(product);
		product = new Product();
		product.setId("p2");
		product.setName("J Donut");
		product.setPrice(200.0);
		product.setQuantity(20);
		product.setStatus(true);
		productList.add(product);
		product = new Product();
		product.setId("p3");
		product.setName("Latte");
		product.setPrice(230.0);
		product.setQuantity(12);
		product.setStatus(true);
		productList.add(product);
		return productList;
	}

	@Override
	public Product find() {
		Product product = new Product();
		product.setId("p1");
		product.setName("Latte");
		product.setPrice(230.0);
		product.setQuantity(12);
		product.setStatus(true);
		return product;
	}

	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub

	}

}
