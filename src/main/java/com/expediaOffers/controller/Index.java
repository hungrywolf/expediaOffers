package com.expediaOffers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.expediaOffers.formbeans.OffersForm;

// TODO: Auto-generated Javadoc
/**
 * The Class Index.
 */
@Controller
public class Index extends AbstractController {

	/**
	 * Go to index.
	 *
	 * @return the model and view
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET, produces = CONTENT_TYPE)
	public ModelAndView goToIndex() {
		OffersForm offersForm = new OffersForm();

		return new ModelAndView("index", "offersForm", offersForm);
	}

}
