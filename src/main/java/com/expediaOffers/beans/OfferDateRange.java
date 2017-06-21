package com.expediaOffers.beans;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

// TODO: Auto-generated Javadoc
/**
 * The Class OfferDateRange.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "travelStartDate", "travelEndDate", "lengthOfStay" })
public class OfferDateRange {

	/** The travel start date. */
	@JsonProperty("travelStartDate")
	private List<Integer> travelStartDate = null;

	/** The travel end date. */
	@JsonProperty("travelEndDate")
	private List<Integer> travelEndDate = null;

	/** The length of stay. */
	@JsonProperty("lengthOfStay")
	private Integer lengthOfStay;

	/** The additional properties. */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets the travel start date.
	 *
	 * @return the travel start date
	 */
	@JsonProperty("travelStartDate")
	public List<Integer> getTravelStartDate() {
		return travelStartDate;
	}

	/**
	 * Sets the travel start date.
	 *
	 * @param travelStartDate
	 *            the new travel start date
	 */
	@JsonProperty("travelStartDate")
	public void setTravelStartDate(List<Integer> travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	/**
	 * Gets the travel end date.
	 *
	 * @return the travel end date
	 */
	@JsonProperty("travelEndDate")
	public List<Integer> getTravelEndDate() {
		return travelEndDate;
	}

	/**
	 * Sets the travel end date.
	 *
	 * @param travelEndDate
	 *            the new travel end date
	 */
	@JsonProperty("travelEndDate")
	public void setTravelEndDate(List<Integer> travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	/**
	 * Gets the length of stay.
	 *
	 * @return the length of stay
	 */
	@JsonProperty("lengthOfStay")
	public Integer getLengthOfStay() {
		return lengthOfStay;
	}

	/**
	 * Sets the length of stay.
	 *
	 * @param lengthOfStay
	 *            the new length of stay
	 */
	@JsonProperty("lengthOfStay")
	public void setLengthOfStay(Integer lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
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
