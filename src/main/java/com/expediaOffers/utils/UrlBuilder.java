package com.expediaOffers.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.util.UriComponentsBuilder;

public class UrlBuilder {

	@Autowired
	private UriComponentsBuilder builder;

	public String getURi() {

		return builder.toUriString();
	}

}
