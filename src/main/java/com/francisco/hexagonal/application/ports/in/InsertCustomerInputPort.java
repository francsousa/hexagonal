package com.francisco.hexagonal.application.ports.in;

import com.francisco.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {
	
	void insert(Customer customer, String zipCode);

}
