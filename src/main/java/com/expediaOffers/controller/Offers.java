package com.expediaOffers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Offers {
	
	@RequestMapping("/getOffers")
	public ModelAndView getOffers() {
 
		String message = "test";
		return new ModelAndView("view", "message", message);
	}

}
