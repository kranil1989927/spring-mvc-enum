package com.learn.modal;

import java.util.Arrays;

public enum AddressType {
	
	OFFICE("office"), HOME("home");

	private String type;

	private AddressType(String type) {
		this.type = type;
	}

	public static AddressType getFromType(String type) {
		for (AddressType addressType : values()) {
			if (type.equalsIgnoreCase(addressType.type)) {
				return addressType;
			}
		}
		throw new IllegalArgumentException(
				"Unknown enum type " + type + ", Allowed values are " + Arrays.toString(values()));
	}
}
