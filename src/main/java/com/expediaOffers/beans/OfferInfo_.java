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
 * The Class OfferInfo_.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "siteID", "language", "currency" })
public class OfferInfo_ {

	/** The site ID. */
	@JsonProperty("siteID")
	private String siteID;

	/** The language. */
	@JsonProperty("language")
	private String language;

	/** The currency. */
	@JsonProperty("currency")
	private String currency;

	/** The additional properties. */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets the site ID.
	 *
	 * @return the site ID
	 */
	@JsonProperty("siteID")
	public String getSiteID() {
		return siteID;
	}

	/**
	 * Sets the site ID.
	 *
	 * @param siteID
	 *            the new site ID
	 */
	@JsonProperty("siteID")
	public void setSiteID(String siteID) {
		this.siteID = siteID;
	}

	/**
	 * Gets the language.
	 *
	 * @return the language
	 */
	@JsonProperty("language")
	public String getLanguage() {
		return language;
	}

	/**
	 * Sets the language.
	 *
	 * @param language
	 *            the new language
	 */
	@JsonProperty("language")
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * Gets the currency.
	 *
	 * @return the currency
	 */
	@JsonProperty("currency")
	public String getCurrency() {
		return currency;
	}

	/**
	 * Sets the currency.
	 *
	 * @param currency
	 *            the new currency
	 */
	@JsonProperty("currency")
	public void setCurrency(String currency) {
		this.currency = currency;
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
