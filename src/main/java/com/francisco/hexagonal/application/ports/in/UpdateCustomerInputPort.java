package com.francisco.hexagonal.application.ports.in;

import com.francisco.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {
	
	void update(Customer customer, String zipCode);

}
