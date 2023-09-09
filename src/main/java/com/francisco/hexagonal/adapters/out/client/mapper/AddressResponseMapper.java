package com.francisco.hexagonal.adapters.out.client.mapper;

import org.mapstruct.Mapper;

import com.francisco.hexagonal.adapters.out.client.response.AddressResponse;
import com.francisco.hexagonal.application.core.domain.Address;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
	
	Address toAddress(AddressResponse addressResponse);

}
