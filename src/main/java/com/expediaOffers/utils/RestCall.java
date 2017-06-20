package com.expediaOffers.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.expediaOffers.beans.Hotel;
import com.expediaOffers.beans.OfferInfo;
import com.expediaOffers.commons.URLs;

public class RestCall {
	@Autowired
	private RestTemplate restTemplate;

	public List<Hotel> getAllHotels() {
		OfferInfo offerInfo = restTemplate.getForObject(URLs.OFFERSURL, OfferInfo.class);

		return offerInfo.getOffers().getHotel();
	}
}
