package com.expediaOffers.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.expediaOffers.beans.Hotel;
import com.expediaOffers.formbeans.OffersForm;
import com.expediaOffers.utils.RestCall;
import com.expediaOffers.utils.UrlBuilder;

@Controller
public class Offers extends AbstractController {

	private static final Logger logger = Logger.getLogger(Offers.class);

	@Autowired
	private RestCall restCall;

	@Autowired
	private UrlBuilder urlBuilder;

	/**
	 * 
	 * @param offersForm
	 * @return
	 */
	@RequestMapping(value = { "/offers"}, method = RequestMethod.GET, produces = CONTENT_TYPE)
	public ModelAndView getOffers(@ModelAttribute("OffersForm") OffersForm offersForm) {

		if (logger.isDebugEnabled())
			logger.debug(new StringBuilder("destinationName value = ").append(
					offersForm.getDestinationName()));

		List<Hotel> hotels = restCall.getAllHotels(urlBuilder
				.getURi(offersForm.getDestinationName()));

		return new ModelAndView("view", "hotels", hotels);
	}

}
