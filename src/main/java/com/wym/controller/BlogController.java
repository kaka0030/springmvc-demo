package com.wym.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wym.service.BlogService;

@Controller
@RequestMapping(value = "/blog")
public class BlogController {

	private static Logger logger = Logger.getLogger(BlogController.class);
	
	@Autowired BlogService blogService;
	
	@RequestMapping(value = "/getBlog",method ={RequestMethod.GET,RequestMethod.POST})
	public String getBlog(Model model){
		model.addAttribute("list", blogService.queryAll());
		return "blog";
	}
	@RequestMapping(value = "/index",method ={RequestMethod.GET,RequestMethod.POST})
	public String index(){
		logger.info("进入了index");
		return "index";
	}
}
