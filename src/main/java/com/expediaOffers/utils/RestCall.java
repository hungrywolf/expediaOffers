package com.expediaOffers.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.expediaOffers.beans.Hotel;
import com.expediaOffers.beans.OfferInfo;

// TODO: Auto-generated Javadoc
/**
 * The Class RestCall.
 */
public class RestCall {

	/** The Constant logger. */
	private static final Logger logger = Logger.getLogger(RestCall.class);

	/** The rest template. */
	@Autowired
	private RestTemplate restTemplate;

	/**
	 * Gets the all hotels.
	 *
	 * @param uri
	 *            the uri
	 * @return the all hotels
	 */
	public List<Hotel> getAllHotels(String uri) {
		ResponseEntity<OfferInfo> response = restTemplate.getForEntity(uri,
				OfferInfo.class);
		OfferInfo offerInfo = response.getBody();

		if (response.hasBody() && offerInfo.getOffers().getHotel() != null) {
			return offerInfo.getOffers().getHotel();
		} else {
			return new ArrayList<>();
		}
	}
}
