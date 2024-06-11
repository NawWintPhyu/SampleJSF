package com.naw.managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.naw.entities.Product;
import com.naw.repositories.ProductRepository;
import com.naw.repositories.ProductRepositoryImpl;

@ManagedBean(name = "productManagedBean")
@SessionScoped
public class ProductManagedBean {

	public ProductRepository productRepository = new ProductRepositoryImpl();
	private List<Product> productList;
	private Product product;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void onLoad() {
		product = new Product();
		this.productList = productRepository.findAll();
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public String add() {
		return "add?faces-redirect=true";
	}

	public String save() {
		return "index?faces-redirect=true";
	}

}
