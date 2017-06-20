package com.expediaOffers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Index {

	@RequestMapping("/index.html")
	public ModelAndView goToIndex() {
		return new ModelAndView("index");
	}


}
