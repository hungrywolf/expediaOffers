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
 * The Class HotelPricingInfo.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "averagePriceValue", "totalPriceValue",
		"originalPricePerNight", "hotelTotalBaseRate",
		"hotelTotalTaxesAndFees", "currency",
		"hotelTotalMandatoryTaxesAndFees", "percentSavings", "drr" })
public class HotelPricingInfo {

	/** The average price value. */
	@JsonProperty("averagePriceValue")
	private Double averagePriceValue;

	/** The total price value. */
	@JsonProperty("totalPriceValue")
	private Double totalPriceValue;

	/** The original price per night. */
	@JsonProperty("originalPricePerNight")
	private String originalPricePerNight;

	/** The hotel total base rate. */
	@JsonProperty("hotelTotalBaseRate")
	private Integer hotelTotalBaseRate;

	/** The hotel total taxes and fees. */
	@JsonProperty("hotelTotalTaxesAndFees")
	private Double hotelTotalTaxesAndFees;

	/** The currency. */
	@JsonProperty("currency")
	private String currency;

	/** The hotel total mandatory taxes and fees. */
	@JsonProperty("hotelTotalMandatoryTaxesAndFees")
	private Integer hotelTotalMandatoryTaxesAndFees;

	/** The percent savings. */
	@JsonProperty("percentSavings")
	private Integer percentSavings;

	/** The drr. */
	@JsonProperty("drr")
	private Boolean drr;

	/** The additional properties. */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets the average price value.
	 *
	 * @return the average price value
	 */
	@JsonProperty("averagePriceValue")
	public Double getAveragePriceValue() {
		return averagePriceValue;
	}

	/**
	 * Sets the average price value.
	 *
	 * @param averagePriceValue
	 *            the new average price value
	 */
	@JsonProperty("averagePriceValue")
	public void setAveragePriceValue(Double averagePriceValue) {
		this.averagePriceValue = averagePriceValue;
	}

	/**
	 * Gets the total price value.
	 *
	 * @return the total price value
	 */
	@JsonProperty("totalPriceValue")
	public Double getTotalPriceValue() {
		return totalPriceValue;
	}

	/**
	 * Sets the total price value.
	 *
	 * @param totalPriceValue
	 *            the new total price value
	 */
	@JsonProperty("totalPriceValue")
	public void setTotalPriceValue(Double totalPriceValue) {
		this.totalPriceValue = totalPriceValue;
	}

	/**
	 * Gets the original price per night.
	 *
	 * @return the original price per night
	 */
	@JsonProperty("originalPricePerNight")
	public String getOriginalPricePerNight() {
		return originalPricePerNight;
	}

	/**
	 * Sets the original price per night.
	 *
	 * @param originalPricePerNight
	 *            the new original price per night
	 */
	@JsonProperty("originalPricePerNight")
	public void setOriginalPricePerNight(String originalPricePerNight) {
		this.originalPricePerNight = originalPricePerNight;
	}

	/**
	 * Gets the hotel total base rate.
	 *
	 * @return the hotel total base rate
	 */
	@JsonProperty("hotelTotalBaseRate")
	public Integer getHotelTotalBaseRate() {
		return hotelTotalBaseRate;
	}

	/**
	 * Sets the hotel total base rate.
	 *
	 * @param hotelTotalBaseRate
	 *            the new hotel total base rate
	 */
	@JsonProperty("hotelTotalBaseRate")
	public void setHotelTotalBaseRate(Integer hotelTotalBaseRate) {
		this.hotelTotalBaseRate = hotelTotalBaseRate;
	}

	/**
	 * Gets the hotel total taxes and fees.
	 *
	 * @return the hotel total taxes and fees
	 */
	@JsonProperty("hotelTotalTaxesAndFees")
	public Double getHotelTotalTaxesAndFees() {
		return hotelTotalTaxesAndFees;
	}

	/**
	 * Sets the hotel total taxes and fees.
	 *
	 * @param hotelTotalTaxesAndFees
	 *            the new hotel total taxes and fees
	 */
	@JsonProperty("hotelTotalTaxesAndFees")
	public void setHotelTotalTaxesAndFees(Double hotelTotalTaxesAndFees) {
		this.hotelTotalTaxesAndFees = hotelTotalTaxesAndFees;
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
	 * Gets the hotel total mandatory taxes and fees.
	 *
	 * @return the hotel total mandatory taxes and fees
	 */
	@JsonProperty("hotelTotalMandatoryTaxesAndFees")
	public Integer getHotelTotalMandatoryTaxesAndFees() {
		return hotelTotalMandatoryTaxesAndFees;
	}

	/**
	 * Sets the hotel total mandatory taxes and fees.
	 *
	 * @param hotelTotalMandatoryTaxesAndFees
	 *            the new hotel total mandatory taxes and fees
	 */
	@JsonProperty("hotelTotalMandatoryTaxesAndFees")
	public void setHotelTotalMandatoryTaxesAndFees(
			Integer hotelTotalMandatoryTaxesAndFees) {
		this.hotelTotalMandatoryTaxesAndFees = hotelTotalMandatoryTaxesAndFees;
	}

	/**
	 * Gets the percent savings.
	 *
	 * @return the percent savings
	 */
	@JsonProperty("percentSavings")
	public Integer getPercentSavings() {
		return percentSavings;
	}

	/**
	 * Sets the percent savings.
	 *
	 * @param percentSavings
	 *            the new percent savings
	 */
	@JsonProperty("percentSavings")
	public void setPercentSavings(Integer percentSavings) {
		this.percentSavings = percentSavings;
	}

	/**
	 * Gets the drr.
	 *
	 * @return the drr
	 */
	@JsonProperty("drr")
	public Boolean getDrr() {
		return drr;
	}

	/**
	 * Sets the drr.
	 *
	 * @param drr
	 *            the new drr
	 */
	@JsonProperty("drr")
	public void setDrr(Boolean drr) {
		this.drr = drr;
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
