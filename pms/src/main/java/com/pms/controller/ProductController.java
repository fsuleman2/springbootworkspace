package com.pms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pms.model.Product;

@Controller
public class ProductController {
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String welcome() {
		return "index";
	}
	@RequestMapping(value = "/register")
	public String loginForm() {
		return "register";
	}
	@RequestMapping("/product") // ModelAndView  //string
	public ModelAndView getProduct() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("product");
		mav.addObject("p",new Product(232,"clothes","54675"));
		return mav;
	}
@RequestMapping("/productdata")
//requestparam coming from jsp
public ModelAndView getProductFromDetails(@RequestParam("pId")int id,@RequestParam("pName") String name, @RequestParam("pCost") String cost) {
	ModelAndView mav=new ModelAndView();
	mav.setViewName("product");
	mav.addObject("p",new Product(id,name,cost));
	return mav;
}
@RequestMapping("/productdata1")
//requestparam coming from jsp
public ModelAndView getProductFromDetails(@ModelAttribute("product") Product prod) {
	ModelAndView mav=new ModelAndView();
	mav.setViewName("product");
	mav.addObject("p",prod);
	return mav;
}
}
