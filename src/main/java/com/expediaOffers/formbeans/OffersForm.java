package com.expediaOffers.formbeans;

// TODO: Auto-generated Javadoc
/**
 * The Class OffersForm.
 */
public class OffersForm {

	/** The destination name. */
	private String destinationName;

	/** The daterange. */
	private String daterange;

	/**
	 * Gets the daterange.
	 *
	 * @return the daterange
	 */
	public String getDaterange() {
		return daterange;
	}

	/**
	 * Sets the daterange.
	 *
	 * @param daterange
	 *            the new daterange
	 */
	public void setDaterange(String daterange) {
		this.daterange = daterange;
	}

	/**
	 * Gets the destination name.
	 *
	 * @return the destination name
	 */
	public String getDestinationName() {
		return destinationName;
	}

	/**
	 * Sets the destination name.
	 *
	 * @param destinationName
	 *            the new destination name
	 */
	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return new StringBuilder().append("destinationName=")
				.append(destinationName).append(" ").append("daterange=")
				.append(daterange).toString();
	}

}
