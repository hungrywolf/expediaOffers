package com.expediaOffers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.expediaOffers.beans.Hotel;
import com.expediaOffers.utils.RestCall;

@Controller
public class Offers {
	@Autowired
	private RestCall restCall;
	
	@RequestMapping("/offers.html")
	public ModelAndView getOffers() {
 
		List<Hotel> hotels = restCall.getAllHotels();
		
		return new ModelAndView("view", "hotels", hotels);
	}

}
