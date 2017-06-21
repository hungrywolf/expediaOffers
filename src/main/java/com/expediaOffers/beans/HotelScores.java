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
 * The Class HotelScores.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "rawAppealScore", "movingAverageScore" })
public class HotelScores {

	/** The raw appeal score. */
	@JsonProperty("rawAppealScore")
	private Double rawAppealScore;

	/** The moving average score. */
	@JsonProperty("movingAverageScore")
	private Double movingAverageScore;

	/** The additional properties. */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets the raw appeal score.
	 *
	 * @return the raw appeal score
	 */
	@JsonProperty("rawAppealScore")
	public Double getRawAppealScore() {
		return rawAppealScore;
	}

	/**
	 * Sets the raw appeal score.
	 *
	 * @param rawAppealScore
	 *            the new raw appeal score
	 */
	@JsonProperty("rawAppealScore")
	public void setRawAppealScore(Double rawAppealScore) {
		this.rawAppealScore = rawAppealScore;
	}

	/**
	 * Gets the moving average score.
	 *
	 * @return the moving average score
	 */
	@JsonProperty("movingAverageScore")
	public Double getMovingAverageScore() {
		return movingAverageScore;
	}

	/**
	 * Sets the moving average score.
	 *
	 * @param movingAverageScore
	 *            the new moving average score
	 */
	@JsonProperty("movingAverageScore")
	public void setMovingAverageScore(Double movingAverageScore) {
		this.movingAverageScore = movingAverageScore;
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
