package com.cts.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.bean.Product;
import com.cts.product.service.ProductService;

@Controller
public class ProductController {
	 @Autowired
	  private ProductService productService; 

	@RequestMapping(value="addProduct.html", method=RequestMethod.GET)
	
	public String geProductPage()
	{
		return "addProduct";
	}
	
	@RequestMapping(value="addProduct.html", method=RequestMethod.POST)
	public ModelAndView validateUser(@ModelAttribute Product product) 
	{
		ModelAndView modelAndView = new ModelAndView();
		if("success".equals(productService.addProduct(product)))
			System.out.println("added product");
			modelAndView.setViewName("admin");
		
		
		
	return modelAndView;
	}
}
	