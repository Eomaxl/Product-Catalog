package com.product.catalogue.service;

import java.util.List;
import java.util.Map;

import com.product.catalogue.entity.Product;
public interface ProductCatalogueService {

	List<Product> getAllProduct();

	Product addProduct(Product product);

	List<Product> searchProduct(Map<String, String> allRequstParam);

	

	String deleteProduct(int id);

}