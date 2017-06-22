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

// TODO: Auto-generated Javadoc
/**
 * The Class Offers.
 */
@Controller
public class Offers extends AbstractController {

	/** The Constant logger. */
	private static final Logger logger = Logger.getLogger(Offers.class);

	/** The rest call. */
	@Autowired
	private RestCall restCall;

	/** The url builder. */
	@Autowired
	private UrlBuilder urlBuilder;

	/**
	 * Gets the offers.
	 *
	 * @param offersForm
	 *            the offers form
	 * @return the offers
	 */
	@RequestMapping(value = { "/offers" }, method = RequestMethod.POST, produces = CONTENT_TYPE)
	public ModelAndView getOffers(
			@ModelAttribute("OffersForm") OffersForm offersForm) {

		if (logger.isDebugEnabled())
			logger.debug(new StringBuilder("OffersForm to String")
					.append(offersForm.toString()));

		List<Hotel> hotels = restCall.getAllHotels(urlBuilder
				.getURi(offersForm));

		if (!hotels.isEmpty()) {
			return new ModelAndView("view", "hotels", hotels);
		} else {
			return new ModelAndView("nodata", "message", String.format(
					NODATAFOUND, "in the index page"));
		}

	}

}
