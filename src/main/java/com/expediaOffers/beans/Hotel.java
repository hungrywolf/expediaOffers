package com.expediaOffers.beans;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

// TODO: Auto-generated Javadoc
/**
 * The Class Hotel.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "offerDateRange", "destination", "hotelInfo",
		"hotelUrgencyInfo", "hotelPricingInfo", "hotelUrls", "hotelScores" })
public class Hotel {

	/** The offer date range. */
	@JsonProperty("offerDateRange")
	private OfferDateRange offerDateRange;

	/** The destination. */
	@JsonProperty("destination")
	private Destination destination;

	/** The hotel info. */
	@JsonProperty("hotelInfo")
	private HotelInfo hotelInfo;

	/** The hotel urgency info. */
	@JsonProperty("hotelUrgencyInfo")
	private HotelUrgencyInfo hotelUrgencyInfo;

	/** The hotel pricing info. */
	@JsonProperty("hotelPricingInfo")
	private HotelPricingInfo hotelPricingInfo;

	/** The hotel urls. */
	@JsonProperty("hotelUrls")
	private HotelUrls hotelUrls;

	/** The hotel scores. */
	@JsonProperty("hotelScores")
	private HotelScores hotelScores;

	/** The additional properties. */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets the offer date range.
	 *
	 * @return the offer date range
	 */
	@JsonProperty("offerDateRange")
	public OfferDateRange getOfferDateRange() {
		return offerDateRange;
	}

	/**
	 * Sets the offer date range.
	 *
	 * @param offerDateRange
	 *            the new offer date range
	 */
	@JsonProperty("offerDateRange")
	public void setOfferDateRange(OfferDateRange offerDateRange) {
		this.offerDateRange = offerDateRange;
	}

	/**
	 * Gets the destination.
	 *
	 * @return the destination
	 */
	@JsonProperty("destination")
	public Destination getDestination() {
		return destination;
	}

	/**
	 * Sets the destination.
	 *
	 * @param destination
	 *            the new destination
	 */
	@JsonProperty("destination")
	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	/**
	 * Gets the hotel info.
	 *
	 * @return the hotel info
	 */
	@JsonProperty("hotelInfo")
	public HotelInfo getHotelInfo() {
		return hotelInfo;
	}

	/**
	 * Sets the hotel info.
	 *
	 * @param hotelInfo
	 *            the new hotel info
	 */
	@JsonProperty("hotelInfo")
	public void setHotelInfo(HotelInfo hotelInfo) {
		this.hotelInfo = hotelInfo;
	}

	/**
	 * Gets the hotel urgency info.
	 *
	 * @return the hotel urgency info
	 */
	@JsonProperty("hotelUrgencyInfo")
	public HotelUrgencyInfo getHotelUrgencyInfo() {
		return hotelUrgencyInfo;
	}

	/**
	 * Sets the hotel urgency info.
	 *
	 * @param hotelUrgencyInfo
	 *            the new hotel urgency info
	 */
	@JsonProperty("hotelUrgencyInfo")
	public void setHotelUrgencyInfo(HotelUrgencyInfo hotelUrgencyInfo) {
		this.hotelUrgencyInfo = hotelUrgencyInfo;
	}

	/**
	 * Gets the hotel pricing info.
	 *
	 * @return the hotel pricing info
	 */
	@JsonProperty("hotelPricingInfo")
	public HotelPricingInfo getHotelPricingInfo() {
		return hotelPricingInfo;
	}

	/**
	 * Sets the hotel pricing info.
	 *
	 * @param hotelPricingInfo
	 *            the new hotel pricing info
	 */
	@JsonProperty("hotelPricingInfo")
	public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
		this.hotelPricingInfo = hotelPricingInfo;
	}

	/**
	 * Gets the hotel urls.
	 *
	 * @return the hotel urls
	 */
	@JsonProperty("hotelUrls")
	public HotelUrls getHotelUrls() {
		return hotelUrls;
	}

	/**
	 * Sets the hotel urls.
	 *
	 * @param hotelUrls
	 *            the new hotel urls
	 */
	@JsonProperty("hotelUrls")
	public void setHotelUrls(HotelUrls hotelUrls) {
		this.hotelUrls = hotelUrls;
	}

	/**
	 * Gets the hotel scores.
	 *
	 * @return the hotel scores
	 */
	@JsonProperty("hotelScores")
	public HotelScores getHotelScores() {
		return hotelScores;
	}

	/**
	 * Sets the hotel scores.
	 *
	 * @param hotelScores
	 *            the new hotel scores
	 */
	@JsonProperty("hotelScores")
	public void setHotelScores(HotelScores hotelScores) {
		this.hotelScores = hotelScores;
	}

	/**
	 * Gets the additional properties.
	 *
	 * @return the additional properties
	 */
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	/**
	 * Sets the additional property.
	 *
	 * @param name
	 *            the name
	 * @param value
	 *            the value
	 */
	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
