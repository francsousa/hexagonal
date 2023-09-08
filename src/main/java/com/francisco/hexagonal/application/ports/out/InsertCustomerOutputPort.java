package com.francisco.hexagonal.application.ports.out;

import com.francisco.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
	
	void insert(Customer customer);

}
