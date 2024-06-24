package com.boostmytool.beststore.controllers;
import org.springframework.data.domain.Sort;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.boostmytool.beststore.models.Product;
import com.boostmytool.beststore.service.ProductsRepository;

@Controller
@RequestMapping("/products")
public class ProductsController 
{
	@Autowired
	private ProductsRepository repo;
	
	@GetMapping({"", "/"})
	public ModelAndView showProductsList() {
		List<Product> products = repo.findAll(Sort.by(Sort.Direction.DESC, "id"));
		ModelAndView mv = new ModelAndView("products/index.html");
		mv.addObject("products", products);
		
		return mv;
	}
	
}
