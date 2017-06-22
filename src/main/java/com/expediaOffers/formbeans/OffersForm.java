package com.expediaOffers.formbeans;

// TODO: Auto-generated Javadoc
/**
 * The Class OffersForm.
 */
public class OffersForm {

	/** The star rating. */
	private String[] starRating;

	/** The guest rating. */
	private String[] guestRating;

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

	/**
	 * Gets the star rating.
	 *
	 * @return the star rating
	 */
	public String[] getStarRating() {
		return starRating;
	}

	/**
	 * Sets the star rating.
	 *
	 * @param starRating
	 *            the new star rating
	 */
	public void setStarRating(String[] starRating) {
		this.starRating = starRating;
	}

	/**
	 * Gets the guest rating.
	 *
	 * @return the guest rating
	 */
	public String[] getGuestRating() {
		return guestRating;
	}

	/**
	 * Sets the guest rating.
	 *
	 * @param guestRating
	 *            the new guest rating
	 */
	public void setGuestRating(String[] guestRating) {
		this.guestRating = guestRating;
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
				.append(daterange).append(" ").append("starRating=")
				.append(starRating).append(" ").append("guestRating=")
				.append(guestRating).toString();
	}

}
