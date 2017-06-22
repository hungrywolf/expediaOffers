package com.expediaOffers.utils;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.web.util.UriComponentsBuilder;

import com.expediaOffers.commons.URLs;
import com.expediaOffers.formbeans.OffersForm;

// TODO: Auto-generated Javadoc
/**
 * The Class UrlBuilder.
 */
public class UrlBuilder {

	/** The Constant logger. */
	private static final Logger logger = Logger.getLogger(UrlBuilder.class);

	/**
	 * Gets the u ri.
	 *
	 * @param offersForm
	 *            the offers form
	 * @return the u ri
	 */
	public String getURi(OffersForm offersForm) {
		UriComponentsBuilder builder = UriComponentsBuilder
				.fromUriString(URLs.OFFERSURL);
		if (offersForm.getDestinationName() != null) {
			if (!"".equals(offersForm.getDestinationName())) {
				builder.queryParam("destinationName",
						offersForm.getDestinationName());

			}
		}

		if (offersForm.getDaterange() != null) {
			if (!"".equals(offersForm.getDaterange())) {
				String[] MaxMinDate = offersForm.getDaterange().split("-");
				if (MaxMinDate.length == 2) {
					builder.queryParam("minTripStartDate", MaxMinDate[0]);
					builder.queryParam("maxTripStartDate", MaxMinDate[1]);
				}
			}
		}

		if (offersForm.getStarRating() != null) {

			String[] starRate = offersForm.getStarRating();
			addParamters(starRate, builder, "maxStarRating", "minStarRating");
		}

		if (offersForm.getGuestRating() != null) {

			String[] guestRate = offersForm.getGuestRating();
			addParamters(guestRate, builder, "maxGuestRating", "minGuestRating");
		}

		if (logger.isDebugEnabled())
			logger.debug(new StringBuilder("builded url >> ").append(
					builder.toUriString()).toString());

		return builder.toUriString();
	}

	/**
	 * Adds the paramters.
	 *
	 * @param array
	 *            the array
	 * @param builder
	 *            the builder
	 * @param max
	 *            the max
	 * @param min
	 *            the min
	 */
	private void addParamters(String[] array, UriComponentsBuilder builder,
			String max, String min) {
		if (array.length != 0) {
			if (array.length >= 2) {
				Arrays.sort(array, new SortArray());
				builder.queryParam(min, array[0]);
				builder.queryParam(max, array[array.length - 1]);
			} else {
				builder.queryParam(min, array[array.length - 1]);
			}
		}
	}

}
