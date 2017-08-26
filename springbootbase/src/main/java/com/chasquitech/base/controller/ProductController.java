package com.chasquitech.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chasquitech.base.domain.Product;
import com.chasquitech.base.services.ProductService;

@Controller
public class ProductController {

	
	private ProductService productService;
	
	
	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	//Create - GET
	@RequestMapping("product/new")
    public String newProduct(Model model){
        model.addAttribute("product", new Product());
        return "productform";
    }
	
	//Create - POST
    @RequestMapping(value = "product", method = RequestMethod.POST)
	public String saveProduct(Product product) {
		productService.saveProduct(product);
		 return "redirect:/product/" + product.getId();
	}
    
    //GET Product
    @RequestMapping("product/{id}")
    public String showProduct(@PathVariable Integer id, Model model){
        model.addAttribute("product", productService.getProductById(id));
        return "productshow";
    }
    
    //GET All Products
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("products", productService.listAllProducts());
        return "products";
    }
    
    //Edit Product - GET
    @RequestMapping("product/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("product", productService.getProductById(id));
        return "productform";
    }
    
    @RequestMapping("product/delete/{id}")
    public String delete(@PathVariable Integer id){
        productService.deleteProduct(id);
        return "redirect:/products";
    }
}

