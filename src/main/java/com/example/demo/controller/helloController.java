package com.example.demo.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.pojo.Name;

@RestController
public class helloController {
@RequestMapping("/")
public ModelAndView index()
{
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("index.jsp");
return modelAndView;
}
@RequestMapping(value = "/helloController",method = RequestMethod.POST)
	 public ModelAndView sayHello(Name name,ModelMap map) {
	 map.addAttribute("name", name.getName()); 
	 ModelAndView modelAndView=new ModelAndView();
	 modelAndView.setViewName("sayHello.jsp");
	 return modelAndView;
	  }
	 
}
