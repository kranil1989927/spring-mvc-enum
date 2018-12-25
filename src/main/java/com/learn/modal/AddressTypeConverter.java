package com.learn.modal;

import java.beans.PropertyEditorSupport;

public class AddressTypeConverter extends PropertyEditorSupport {

	@Override
	public void setAsText(final String text) throws IllegalArgumentException {
		super.setValue(AddressType.getFromType(text));
	}
}
