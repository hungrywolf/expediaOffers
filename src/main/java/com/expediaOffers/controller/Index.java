package com.expediaOffers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Index extends AbstractController {

	@RequestMapping(value = "/index", method = RequestMethod.GET, produces = CONTENT_TYPE)
	public ModelAndView goToIndex() {

		return new ModelAndView("index");
	}

}
