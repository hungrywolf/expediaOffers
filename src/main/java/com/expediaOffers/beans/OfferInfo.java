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
 * The Class OfferInfo.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "offerInfo", "userInfo", "offers" })
public class OfferInfo {

	/** The offer info. */
	@JsonProperty("offerInfo")
	private OfferInfo_ offerInfo;

	/** The user info. */
	@JsonProperty("userInfo")
	private UserInfo userInfo;

	/** The offers. */
	@JsonProperty("offers")
	private Offers offers;

	/** The additional properties. */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets the offer info.
	 *
	 * @return the offer info
	 */
	@JsonProperty("offerInfo")
	public OfferInfo_ getOfferInfo() {
		return offerInfo;
	}

	/**
	 * Sets the offer info.
	 *
	 * @param offerInfo
	 *            the new offer info
	 */
	@JsonProperty("offerInfo")
	public void setOfferInfo(OfferInfo_ offerInfo) {
		this.offerInfo = offerInfo;
	}

	/**
	 * Gets the user info.
	 *
	 * @return the user info
	 */
	@JsonProperty("userInfo")
	public UserInfo getUserInfo() {
		return userInfo;
	}

	/**
	 * Sets the user info.
	 *
	 * @param userInfo
	 *            the new user info
	 */
	@JsonProperty("userInfo")
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	/**
	 * Gets the offers.
	 *
	 * @return the offers
	 */
	@JsonProperty("offers")
	public Offers getOffers() {
		return offers;
	}

	/**
	 * Sets the offers.
	 *
	 * @param offers
	 *            the new offers
	 */
	@JsonProperty("offers")
	public void setOffers(Offers offers) {
		this.offers = offers;
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
