package com.learn.modal;

public class Address {
	
	private AddressType addressType;
	private String lane;
	private String area;

	/**
	 * @return the addressType
	 */
	public AddressType getAddressType() {
		return addressType;
	}

	/**
	 * @param addressType
	 *            the addressType to set
	 */
	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	/**
	 * @return the lane
	 */
	public String getLane() {
		return lane;
	}

	/**
	 * @param lane the lane to set
	 */
	public void setLane(String lane) {
		this.lane = lane;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}


}
