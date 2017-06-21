package com.expediaOffers.utils;

import org.apache.log4j.Logger;
import org.springframework.web.util.UriComponentsBuilder;

import com.expediaOffers.commons.URLs;

public class UrlBuilder {

	private static final Logger logger = Logger.getLogger(UrlBuilder.class);

	public String getURi(String destinationName) {
		UriComponentsBuilder builder = UriComponentsBuilder
				.fromUriString(URLs.OFFERSURL);
		if (destinationName != null) {
			builder.queryParam("destinationName", destinationName);
		}

		if (logger.isDebugEnabled())
			logger.debug(new StringBuilder("builded url >> ").append(
					builder.toUriString()).toString());

		return builder.toUriString();
	}

}
