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
 * The Class HotelUrgencyInfo.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "airAttachRemainingTime", "numberOfPeopleViewing",
		"numberOfPeopleBooked", "numberOfRoomsLeft", "lastBookedTime",
		"almostSoldStatus", "link", "almostSoldOutRoomTypeInfoCollection",
		"airAttachEnabled" })
public class HotelUrgencyInfo {

	/** The air attach remaining time. */
	@JsonProperty("airAttachRemainingTime")
	private Integer airAttachRemainingTime;

	/** The number of people viewing. */
	@JsonProperty("numberOfPeopleViewing")
	private Integer numberOfPeopleViewing;

	/** The number of people booked. */
	@JsonProperty("numberOfPeopleBooked")
	private Integer numberOfPeopleBooked;

	/** The number of rooms left. */
	@JsonProperty("numberOfRoomsLeft")
	private Integer numberOfRoomsLeft;

	/** The last booked time. */
	@JsonProperty("lastBookedTime")
	private Long lastBookedTime;

	/** The almost sold status. */
	@JsonProperty("almostSoldStatus")
	private String almostSoldStatus;

	/** The link. */
	@JsonProperty("link")
	private String link;

	/** The almost sold out room type info collection. */
	@JsonProperty("almostSoldOutRoomTypeInfoCollection")
	private List<Object> almostSoldOutRoomTypeInfoCollection = null;

	/** The air attach enabled. */
	@JsonProperty("airAttachEnabled")
	private Boolean airAttachEnabled;

	/** The additional properties. */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets the air attach remaining time.
	 *
	 * @return the air attach remaining time
	 */
	@JsonProperty("airAttachRemainingTime")
	public Integer getAirAttachRemainingTime() {
		return airAttachRemainingTime;
	}

	/**
	 * Sets the air attach remaining time.
	 *
	 * @param airAttachRemainingTime
	 *            the new air attach remaining time
	 */
	@JsonProperty("airAttachRemainingTime")
	public void setAirAttachRemainingTime(Integer airAttachRemainingTime) {
		this.airAttachRemainingTime = airAttachRemainingTime;
	}

	/**
	 * Gets the number of people viewing.
	 *
	 * @return the number of people viewing
	 */
	@JsonProperty("numberOfPeopleViewing")
	public Integer getNumberOfPeopleViewing() {
		return numberOfPeopleViewing;
	}

	/**
	 * Sets the number of people viewing.
	 *
	 * @param numberOfPeopleViewing
	 *            the new number of people viewing
	 */
	@JsonProperty("numberOfPeopleViewing")
	public void setNumberOfPeopleViewing(Integer numberOfPeopleViewing) {
		this.numberOfPeopleViewing = numberOfPeopleViewing;
	}

	/**
	 * Gets the number of people booked.
	 *
	 * @return the number of people booked
	 */
	@JsonProperty("numberOfPeopleBooked")
	public Integer getNumberOfPeopleBooked() {
		return numberOfPeopleBooked;
	}

	/**
	 * Sets the number of people booked.
	 *
	 * @param numberOfPeopleBooked
	 *            the new number of people booked
	 */
	@JsonProperty("numberOfPeopleBooked")
	public void setNumberOfPeopleBooked(Integer numberOfPeopleBooked) {
		this.numberOfPeopleBooked = numberOfPeopleBooked;
	}

	/**
	 * Gets the number of rooms left.
	 *
	 * @return the number of rooms left
	 */
	@JsonProperty("numberOfRoomsLeft")
	public Integer getNumberOfRoomsLeft() {
		return numberOfRoomsLeft;
	}

	/**
	 * Sets the number of rooms left.
	 *
	 * @param numberOfRoomsLeft
	 *            the new number of rooms left
	 */
	@JsonProperty("numberOfRoomsLeft")
	public void setNumberOfRoomsLeft(Integer numberOfRoomsLeft) {
		this.numberOfRoomsLeft = numberOfRoomsLeft;
	}

	/**
	 * Gets the last booked time.
	 *
	 * @return the last booked time
	 */
	@JsonProperty("lastBookedTime")
	public Long getLastBookedTime() {
		return lastBookedTime;
	}

	/**
	 * Sets the last booked time.
	 *
	 * @param lastBookedTime
	 *            the new last booked time
	 */
	@JsonProperty("lastBookedTime")
	public void setLastBookedTime(Long lastBookedTime) {
		this.lastBookedTime = lastBookedTime;
	}

	/**
	 * Gets the almost sold status.
	 *
	 * @return the almost sold status
	 */
	@JsonProperty("almostSoldStatus")
	public String getAlmostSoldStatus() {
		return almostSoldStatus;
	}

	/**
	 * Sets the almost sold status.
	 *
	 * @param almostSoldStatus
	 *            the new almost sold status
	 */
	@JsonProperty("almostSoldStatus")
	public void setAlmostSoldStatus(String almostSoldStatus) {
		this.almostSoldStatus = almostSoldStatus;
	}

	/**
	 * Gets the link.
	 *
	 * @return the link
	 */
	@JsonProperty("link")
	public String getLink() {
		return link;
	}

	/**
	 * Sets the link.
	 *
	 * @param link
	 *            the new link
	 */
	@JsonProperty("link")
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * Gets the almost sold out room type info collection.
	 *
	 * @return the almost sold out room type info collection
	 */
	@JsonProperty("almostSoldOutRoomTypeInfoCollection")
	public List<Object> getAlmostSoldOutRoomTypeInfoCollection() {
		return almostSoldOutRoomTypeInfoCollection;
	}

	/**
	 * Sets the almost sold out room type info collection.
	 *
	 * @param almostSoldOutRoomTypeInfoCollection
	 *            the new almost sold out room type info collection
	 */
	@JsonProperty("almostSoldOutRoomTypeInfoCollection")
	public void setAlmostSoldOutRoomTypeInfoCollection(
			List<Object> almostSoldOutRoomTypeInfoCollection) {
		this.almostSoldOutRoomTypeInfoCollection = almostSoldOutRoomTypeInfoCollection;
	}

	/**
	 * Gets the air attach enabled.
	 *
	 * @return the air attach enabled
	 */
	@JsonProperty("airAttachEnabled")
	public Boolean getAirAttachEnabled() {
		return airAttachEnabled;
	}

	/**
	 * Sets the air attach enabled.
	 *
	 * @param airAttachEnabled
	 *            the new air attach enabled
	 */
	@JsonProperty("airAttachEnabled")
	public void setAirAttachEnabled(Boolean airAttachEnabled) {
		this.airAttachEnabled = airAttachEnabled;
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
