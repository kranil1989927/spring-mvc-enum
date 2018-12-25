package com.learn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.learn.modal.Address;
import com.learn.modal.AddressType;
import com.learn.modal.AddressTypeConverter;

@RestController
public class AddressController {

	@GetMapping(value="/{type}")
	public List<Address> get(@PathVariable(value ="type") AddressType addressType){
		return getAddressByType(addressType);
	}

	private List<Address> getAddressByType(AddressType addressType) {
		List<Address> addrList = new ArrayList<Address>();

		Address address = new Address();
		address.setAddressType(addressType);

		if (addressType == AddressType.OFFICE) {
			address.setLane("Office Lane");
			address.setArea("New York");
		} else if (addressType == AddressType.HOME) {
			address.setLane("Home Lane");
			address.setArea("California");
		}
		addrList.add(address);
		return addrList;
	}
	
	/*
	 * Spring provides @InitBinder annotation that identifies methods which initializes the WebDataBinder and 
	 * this WebDataBinder populates the arguments to the annotated methods. Hence, the easy way is to register 
	 * some custom editors in Spring which will convert those Strings to enums as request parameter. 
	 * 
	 * Everytime this api is called, our custom converter will execute and the	String in the request parameter 
	 * will be converted to corresponding enum.
	 */
	@InitBinder
	public void initBinder(final WebDataBinder webDataBinder) {
		webDataBinder.registerCustomEditor(AddressType.class, new AddressTypeConverter());
	}
}
