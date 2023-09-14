package com.francisco.hexagonal.adapters.in.consumer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.francisco.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.francisco.hexagonal.application.core.domain.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

	@Mapping(target = "address", ignore = true)
	Customer toCustomer(CustomerMessage customerMessage);

}
