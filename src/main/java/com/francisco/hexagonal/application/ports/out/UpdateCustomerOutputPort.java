package com.francisco.hexagonal.application.ports.out;

import com.francisco.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {
	
	void update(Customer customer);

}
