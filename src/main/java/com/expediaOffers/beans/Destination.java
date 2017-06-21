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
 * The Class Destination.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "regionID", "longName", "country", "province", "city" })
public class Destination {

	/** The region ID. */
	@JsonProperty("regionID")
	private String regionID;

	/** The long name. */
	@JsonProperty("longName")
	private String longName;

	/** The country. */
	@JsonProperty("country")
	private String country;

	/** The province. */
	@JsonProperty("province")
	private String province;

	/** The city. */
	@JsonProperty("city")
	private String city;

	/** The additional properties. */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets the region ID.
	 *
	 * @return the region ID
	 */
	@JsonProperty("regionID")
	public String getRegionID() {
		return regionID;
	}

	/**
	 * Sets the region ID.
	 *
	 * @param regionID
	 *            the new region ID
	 */
	@JsonProperty("regionID")
	public void setRegionID(String regionID) {
		this.regionID = regionID;
	}

	/**
	 * Gets the long name.
	 *
	 * @return the long name
	 */
	@JsonProperty("longName")
	public String getLongName() {
		return longName;
	}

	/**
	 * Sets the long name.
	 *
	 * @param longName
	 *            the new long name
	 */
	@JsonProperty("longName")
	public void setLongName(String longName) {
		this.longName = longName;
	}

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	@JsonProperty("country")
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country
	 *            the new country
	 */
	@JsonProperty("country")
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * Gets the province.
	 *
	 * @return the province
	 */
	@JsonProperty("province")
	public String getProvince() {
		return province;
	}

	/**
	 * Sets the province.
	 *
	 * @param province
	 *            the new province
	 */
	@JsonProperty("province")
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	@JsonProperty("city")
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city
	 *            the new city
	 */
	@JsonProperty("city")
	public void setCity(String city) {
		this.city = city;
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
