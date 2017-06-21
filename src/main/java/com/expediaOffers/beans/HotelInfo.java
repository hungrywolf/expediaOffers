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
 * The Class HotelInfo.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "hotelId", "hotelName", "hotelDestination",
		"hotelDestinationRegionID", "hotelLongDestination",
		"hotelStreetAddress", "hotelCity", "hotelProvince", "hotelCountryCode",
		"hotelLocation", "hotelLatitude", "hotelLongitude", "hotelStarRating",
		"hotelGuestReviewRating", "travelStartDate", "travelEndDate",
		"hotelImageUrl", "carPackageScore", "description", "distanceFromUser",
		"language", "movingAverageScore", "promotionAmount",
		"promotionDescription", "promotionTag", "rawAppealScore",
		"relevanceScore", "statusCode", "statusDescription", "carPackage",
		"allInclusive" })
public class HotelInfo {

	/** The hotel id. */
	@JsonProperty("hotelId")
	private String hotelId;

	/** The hotel name. */
	@JsonProperty("hotelName")
	private String hotelName;

	/** The hotel destination. */
	@JsonProperty("hotelDestination")
	private String hotelDestination;

	/** The hotel destination region ID. */
	@JsonProperty("hotelDestinationRegionID")
	private String hotelDestinationRegionID;

	/** The hotel long destination. */
	@JsonProperty("hotelLongDestination")
	private String hotelLongDestination;

	/** The hotel street address. */
	@JsonProperty("hotelStreetAddress")
	private String hotelStreetAddress;

	/** The hotel city. */
	@JsonProperty("hotelCity")
	private String hotelCity;

	/** The hotel province. */
	@JsonProperty("hotelProvince")
	private String hotelProvince;

	/** The hotel country code. */
	@JsonProperty("hotelCountryCode")
	private String hotelCountryCode;

	/** The hotel location. */
	@JsonProperty("hotelLocation")
	private String hotelLocation;

	/** The hotel latitude. */
	@JsonProperty("hotelLatitude")
	private Double hotelLatitude;

	/** The hotel longitude. */
	@JsonProperty("hotelLongitude")
	private Double hotelLongitude;

	/** The hotel star rating. */
	@JsonProperty("hotelStarRating")
	private String hotelStarRating;

	/** The hotel guest review rating. */
	@JsonProperty("hotelGuestReviewRating")
	private Double hotelGuestReviewRating;

	/** The travel start date. */
	@JsonProperty("travelStartDate")
	private String travelStartDate;

	/** The travel end date. */
	@JsonProperty("travelEndDate")
	private String travelEndDate;

	/** The hotel image url. */
	@JsonProperty("hotelImageUrl")
	private String hotelImageUrl;

	/** The car package score. */
	@JsonProperty("carPackageScore")
	private Double carPackageScore;

	/** The description. */
	@JsonProperty("description")
	private String description;

	/** The distance from user. */
	@JsonProperty("distanceFromUser")
	private Integer distanceFromUser;

	/** The language. */
	@JsonProperty("language")
	private String language;

	/** The moving average score. */
	@JsonProperty("movingAverageScore")
	private Double movingAverageScore;

	/** The promotion amount. */
	@JsonProperty("promotionAmount")
	private Integer promotionAmount;

	/** The promotion description. */
	@JsonProperty("promotionDescription")
	private String promotionDescription;

	/** The promotion tag. */
	@JsonProperty("promotionTag")
	private String promotionTag;

	/** The raw appeal score. */
	@JsonProperty("rawAppealScore")
	private Double rawAppealScore;

	/** The relevance score. */
	@JsonProperty("relevanceScore")
	private Integer relevanceScore;

	/** The status code. */
	@JsonProperty("statusCode")
	private String statusCode;

	/** The status description. */
	@JsonProperty("statusDescription")
	private String statusDescription;

	/** The car package. */
	@JsonProperty("carPackage")
	private Boolean carPackage;

	/** The all inclusive. */
	@JsonProperty("allInclusive")
	private Boolean allInclusive;

	/** The additional properties. */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets the hotel id.
	 *
	 * @return the hotel id
	 */
	@JsonProperty("hotelId")
	public String getHotelId() {
		return hotelId;
	}

	/**
	 * Sets the hotel id.
	 *
	 * @param hotelId
	 *            the new hotel id
	 */
	@JsonProperty("hotelId")
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	/**
	 * Gets the hotel name.
	 *
	 * @return the hotel name
	 */
	@JsonProperty("hotelName")
	public String getHotelName() {
		return hotelName;
	}

	/**
	 * Sets the hotel name.
	 *
	 * @param hotelName
	 *            the new hotel name
	 */
	@JsonProperty("hotelName")
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	/**
	 * Gets the hotel destination.
	 *
	 * @return the hotel destination
	 */
	@JsonProperty("hotelDestination")
	public String getHotelDestination() {
		return hotelDestination;
	}

	/**
	 * Sets the hotel destination.
	 *
	 * @param hotelDestination
	 *            the new hotel destination
	 */
	@JsonProperty("hotelDestination")
	public void setHotelDestination(String hotelDestination) {
		this.hotelDestination = hotelDestination;
	}

	/**
	 * Gets the hotel destination region ID.
	 *
	 * @return the hotel destination region ID
	 */
	@JsonProperty("hotelDestinationRegionID")
	public String getHotelDestinationRegionID() {
		return hotelDestinationRegionID;
	}

	/**
	 * Sets the hotel destination region ID.
	 *
	 * @param hotelDestinationRegionID
	 *            the new hotel destination region ID
	 */
	@JsonProperty("hotelDestinationRegionID")
	public void setHotelDestinationRegionID(String hotelDestinationRegionID) {
		this.hotelDestinationRegionID = hotelDestinationRegionID;
	}

	/**
	 * Gets the hotel long destination.
	 *
	 * @return the hotel long destination
	 */
	@JsonProperty("hotelLongDestination")
	public String getHotelLongDestination() {
		return hotelLongDestination;
	}

	/**
	 * Sets the hotel long destination.
	 *
	 * @param hotelLongDestination
	 *            the new hotel long destination
	 */
	@JsonProperty("hotelLongDestination")
	public void setHotelLongDestination(String hotelLongDestination) {
		this.hotelLongDestination = hotelLongDestination;
	}

	/**
	 * Gets the hotel street address.
	 *
	 * @return the hotel street address
	 */
	@JsonProperty("hotelStreetAddress")
	public String getHotelStreetAddress() {
		return hotelStreetAddress;
	}

	/**
	 * Sets the hotel street address.
	 *
	 * @param hotelStreetAddress
	 *            the new hotel street address
	 */
	@JsonProperty("hotelStreetAddress")
	public void setHotelStreetAddress(String hotelStreetAddress) {
		this.hotelStreetAddress = hotelStreetAddress;
	}

	/**
	 * Gets the hotel city.
	 *
	 * @return the hotel city
	 */
	@JsonProperty("hotelCity")
	public String getHotelCity() {
		return hotelCity;
	}

	/**
	 * Sets the hotel city.
	 *
	 * @param hotelCity
	 *            the new hotel city
	 */
	@JsonProperty("hotelCity")
	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	/**
	 * Gets the hotel province.
	 *
	 * @return the hotel province
	 */
	@JsonProperty("hotelProvince")
	public String getHotelProvince() {
		return hotelProvince;
	}

	/**
	 * Sets the hotel province.
	 *
	 * @param hotelProvince
	 *            the new hotel province
	 */
	@JsonProperty("hotelProvince")
	public void setHotelProvince(String hotelProvince) {
		this.hotelProvince = hotelProvince;
	}

	/**
	 * Gets the hotel country code.
	 *
	 * @return the hotel country code
	 */
	@JsonProperty("hotelCountryCode")
	public String getHotelCountryCode() {
		return hotelCountryCode;
	}

	/**
	 * Sets the hotel country code.
	 *
	 * @param hotelCountryCode
	 *            the new hotel country code
	 */
	@JsonProperty("hotelCountryCode")
	public void setHotelCountryCode(String hotelCountryCode) {
		this.hotelCountryCode = hotelCountryCode;
	}

	/**
	 * Gets the hotel location.
	 *
	 * @return the hotel location
	 */
	@JsonProperty("hotelLocation")
	public String getHotelLocation() {
		return hotelLocation;
	}

	/**
	 * Sets the hotel location.
	 *
	 * @param hotelLocation
	 *            the new hotel location
	 */
	@JsonProperty("hotelLocation")
	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}

	/**
	 * Gets the hotel latitude.
	 *
	 * @return the hotel latitude
	 */
	@JsonProperty("hotelLatitude")
	public Double getHotelLatitude() {
		return hotelLatitude;
	}

	/**
	 * Sets the hotel latitude.
	 *
	 * @param hotelLatitude
	 *            the new hotel latitude
	 */
	@JsonProperty("hotelLatitude")
	public void setHotelLatitude(Double hotelLatitude) {
		this.hotelLatitude = hotelLatitude;
	}

	/**
	 * Gets the hotel longitude.
	 *
	 * @return the hotel longitude
	 */
	@JsonProperty("hotelLongitude")
	public Double getHotelLongitude() {
		return hotelLongitude;
	}

	/**
	 * Sets the hotel longitude.
	 *
	 * @param hotelLongitude
	 *            the new hotel longitude
	 */
	@JsonProperty("hotelLongitude")
	public void setHotelLongitude(Double hotelLongitude) {
		this.hotelLongitude = hotelLongitude;
	}

	/**
	 * Gets the hotel star rating.
	 *
	 * @return the hotel star rating
	 */
	@JsonProperty("hotelStarRating")
	public String getHotelStarRating() {
		return hotelStarRating;
	}

	/**
	 * Sets the hotel star rating.
	 *
	 * @param hotelStarRating
	 *            the new hotel star rating
	 */
	@JsonProperty("hotelStarRating")
	public void setHotelStarRating(String hotelStarRating) {
		this.hotelStarRating = hotelStarRating;
	}

	/**
	 * Gets the hotel guest review rating.
	 *
	 * @return the hotel guest review rating
	 */
	@JsonProperty("hotelGuestReviewRating")
	public Double getHotelGuestReviewRating() {
		return hotelGuestReviewRating;
	}

	/**
	 * Sets the hotel guest review rating.
	 *
	 * @param hotelGuestReviewRating
	 *            the new hotel guest review rating
	 */
	@JsonProperty("hotelGuestReviewRating")
	public void setHotelGuestReviewRating(Double hotelGuestReviewRating) {
		this.hotelGuestReviewRating = hotelGuestReviewRating;
	}

	/**
	 * Gets the travel start date.
	 *
	 * @return the travel start date
	 */
	@JsonProperty("travelStartDate")
	public String getTravelStartDate() {
		return travelStartDate;
	}

	/**
	 * Sets the travel start date.
	 *
	 * @param travelStartDate
	 *            the new travel start date
	 */
	@JsonProperty("travelStartDate")
	public void setTravelStartDate(String travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	/**
	 * Gets the travel end date.
	 *
	 * @return the travel end date
	 */
	@JsonProperty("travelEndDate")
	public String getTravelEndDate() {
		return travelEndDate;
	}

	/**
	 * Sets the travel end date.
	 *
	 * @param travelEndDate
	 *            the new travel end date
	 */
	@JsonProperty("travelEndDate")
	public void setTravelEndDate(String travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	/**
	 * Gets the hotel image url.
	 *
	 * @return the hotel image url
	 */
	@JsonProperty("hotelImageUrl")
	public String getHotelImageUrl() {
		return hotelImageUrl;
	}

	/**
	 * Sets the hotel image url.
	 *
	 * @param hotelImageUrl
	 *            the new hotel image url
	 */
	@JsonProperty("hotelImageUrl")
	public void setHotelImageUrl(String hotelImageUrl) {
		this.hotelImageUrl = hotelImageUrl;
	}

	/**
	 * Gets the car package score.
	 *
	 * @return the car package score
	 */
	@JsonProperty("carPackageScore")
	public Double getCarPackageScore() {
		return carPackageScore;
	}

	/**
	 * Sets the car package score.
	 *
	 * @param carPackageScore
	 *            the new car package score
	 */
	@JsonProperty("carPackageScore")
	public void setCarPackageScore(Double carPackageScore) {
		this.carPackageScore = carPackageScore;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description
	 *            the new description
	 */
	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the distance from user.
	 *
	 * @return the distance from user
	 */
	@JsonProperty("distanceFromUser")
	public Integer getDistanceFromUser() {
		return distanceFromUser;
	}

	/**
	 * Sets the distance from user.
	 *
	 * @param distanceFromUser
	 *            the new distance from user
	 */
	@JsonProperty("distanceFromUser")
	public void setDistanceFromUser(Integer distanceFromUser) {
		this.distanceFromUser = distanceFromUser;
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
	 * Gets the promotion amount.
	 *
	 * @return the promotion amount
	 */
	@JsonProperty("promotionAmount")
	public Integer getPromotionAmount() {
		return promotionAmount;
	}

	/**
	 * Sets the promotion amount.
	 *
	 * @param promotionAmount
	 *            the new promotion amount
	 */
	@JsonProperty("promotionAmount")
	public void setPromotionAmount(Integer promotionAmount) {
		this.promotionAmount = promotionAmount;
	}

	/**
	 * Gets the promotion description.
	 *
	 * @return the promotion description
	 */
	@JsonProperty("promotionDescription")
	public String getPromotionDescription() {
		return promotionDescription;
	}

	/**
	 * Sets the promotion description.
	 *
	 * @param promotionDescription
	 *            the new promotion description
	 */
	@JsonProperty("promotionDescription")
	public void setPromotionDescription(String promotionDescription) {
		this.promotionDescription = promotionDescription;
	}

	/**
	 * Gets the promotion tag.
	 *
	 * @return the promotion tag
	 */
	@JsonProperty("promotionTag")
	public String getPromotionTag() {
		return promotionTag;
	}

	/**
	 * Sets the promotion tag.
	 *
	 * @param promotionTag
	 *            the new promotion tag
	 */
	@JsonProperty("promotionTag")
	public void setPromotionTag(String promotionTag) {
		this.promotionTag = promotionTag;
	}

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
	 * Gets the relevance score.
	 *
	 * @return the relevance score
	 */
	@JsonProperty("relevanceScore")
	public Integer getRelevanceScore() {
		return relevanceScore;
	}

	/**
	 * Sets the relevance score.
	 *
	 * @param relevanceScore
	 *            the new relevance score
	 */
	@JsonProperty("relevanceScore")
	public void setRelevanceScore(Integer relevanceScore) {
		this.relevanceScore = relevanceScore;
	}

	/**
	 * Gets the status code.
	 *
	 * @return the status code
	 */
	@JsonProperty("statusCode")
	public String getStatusCode() {
		return statusCode;
	}

	/**
	 * Sets the status code.
	 *
	 * @param statusCode
	 *            the new status code
	 */
	@JsonProperty("statusCode")
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * Gets the status description.
	 *
	 * @return the status description
	 */
	@JsonProperty("statusDescription")
	public String getStatusDescription() {
		return statusDescription;
	}

	/**
	 * Sets the status description.
	 *
	 * @param statusDescription
	 *            the new status description
	 */
	@JsonProperty("statusDescription")
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	/**
	 * Gets the car package.
	 *
	 * @return the car package
	 */
	@JsonProperty("carPackage")
	public Boolean getCarPackage() {
		return carPackage;
	}

	/**
	 * Sets the car package.
	 *
	 * @param carPackage
	 *            the new car package
	 */
	@JsonProperty("carPackage")
	public void setCarPackage(Boolean carPackage) {
		this.carPackage = carPackage;
	}

	/**
	 * Gets the all inclusive.
	 *
	 * @return the all inclusive
	 */
	@JsonProperty("allInclusive")
	public Boolean getAllInclusive() {
		return allInclusive;
	}

	/**
	 * Sets the all inclusive.
	 *
	 * @param allInclusive
	 *            the new all inclusive
	 */
	@JsonProperty("allInclusive")
	public void setAllInclusive(Boolean allInclusive) {
		this.allInclusive = allInclusive;
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
