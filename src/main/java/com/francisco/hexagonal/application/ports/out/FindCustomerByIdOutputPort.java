package com.francisco.hexagonal.application.ports.out;

import java.util.Optional;

import com.francisco.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdOutputPort {
	
	Optional<Customer> find(String id);

}
