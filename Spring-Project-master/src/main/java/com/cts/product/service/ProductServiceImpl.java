package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.bean.Product;
import com.cts.product.dao.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDAO productDAO;
	
	@Transactional(readOnly = true, propagation=Propagation.SUPPORTS)
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		return productDAO.addProduct(product);
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productDAO.getAllProducts();
	}

	public Product findProduct(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteProduct(String productId) {
		// TODO Auto-generated method stub
		return productDAO.deleteProduct(productId);
	}

	public List<Product> filterProducts(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productDAO.updateProduct(product);
	}

}
