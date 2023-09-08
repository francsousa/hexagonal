package com.francisco.hexagonal.application.ports.out;

import com.francisco.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
	
	Address find(String zipCode);

}
