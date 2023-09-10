package com.francisco.hexagonal.adapters.out;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.francisco.hexagonal.adapters.out.repository.CustomerRepository;
import com.francisco.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.francisco.hexagonal.application.core.domain.Customer;
import com.francisco.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerEntityMapper customerEntityMapper;

	@Override
	public Optional<Customer> find(String id) {
		var customerEntity = customerRepository.findById(id);
		return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
	}

}
