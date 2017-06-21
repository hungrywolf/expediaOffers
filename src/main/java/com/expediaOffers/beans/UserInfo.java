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
 * The Class UserInfo.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "persona", "userId" })
public class UserInfo {

	/** The persona. */
	@JsonProperty("persona")
	private Persona persona;

	/** The user id. */
	@JsonProperty("userId")
	private String userId;

	/** The additional properties. */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets the persona.
	 *
	 * @return the persona
	 */
	@JsonProperty("persona")
	public Persona getPersona() {
		return persona;
	}

	/**
	 * Sets the persona.
	 *
	 * @param persona
	 *            the new persona
	 */
	@JsonProperty("persona")
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	@JsonProperty("userId")
	public String getUserId() {
		return userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId
	 *            the new user id
	 */
	@JsonProperty("userId")
	public void setUserId(String userId) {
		this.userId = userId;
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
