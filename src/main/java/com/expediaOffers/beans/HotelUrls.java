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
 * The Class HotelUrls.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "hotelInfositeUrl", "hotelSearchResultUrl" })
public class HotelUrls {

	/** The hotel infosite url. */
	@JsonProperty("hotelInfositeUrl")
	private String hotelInfositeUrl;

	/** The hotel search result url. */
	@JsonProperty("hotelSearchResultUrl")
	private String hotelSearchResultUrl;

	/** The additional properties. */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets the hotel infosite url.
	 *
	 * @return the hotel infosite url
	 */
	@JsonProperty("hotelInfositeUrl")
	public String getHotelInfositeUrl() {
		return hotelInfositeUrl;
	}

	/**
	 * Sets the hotel infosite url.
	 *
	 * @param hotelInfositeUrl
	 *            the new hotel infosite url
	 */
	@JsonProperty("hotelInfositeUrl")
	public void setHotelInfositeUrl(String hotelInfositeUrl) {
		this.hotelInfositeUrl = hotelInfositeUrl;
	}

	/**
	 * Gets the hotel search result url.
	 *
	 * @return the hotel search result url
	 */
	@JsonProperty("hotelSearchResultUrl")
	public String getHotelSearchResultUrl() {
		return hotelSearchResultUrl;
	}

	/**
	 * Sets the hotel search result url.
	 *
	 * @param hotelSearchResultUrl
	 *            the new hotel search result url
	 */
	@JsonProperty("hotelSearchResultUrl")
	public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
		this.hotelSearchResultUrl = hotelSearchResultUrl;
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
