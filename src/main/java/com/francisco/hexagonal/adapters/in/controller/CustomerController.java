package com.francisco.hexagonal.adapters.in.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.francisco.hexagonal.adapters.in.controller.mapper.CustomerMapper;
import com.francisco.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.francisco.hexagonal.adapters.in.controller.response.CustomerResponse;
import com.francisco.hexagonal.application.core.domain.Customer;
import com.francisco.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.francisco.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.francisco.hexagonal.application.ports.in.UpdateCustomerInputPort;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
	
	@Autowired
	private InsertCustomerInputPort insertCustomerInputPort;
	
	@Autowired
	private FindCustomerByIdInputPort findCustomerByIdInputPort;
	
	@Autowired
	private UpdateCustomerInputPort updateCustomerInputPort;
	
	@Autowired
	private CustomerMapper customerMapper;
	
	@PostMapping
	public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
		var customer = customerMapper.toCustomer(customerRequest);
		insertCustomerInputPort.insert(customer, customerRequest.getZipCode());
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CustomerResponse> findById(@PathVariable final String id) {
		var customer = findCustomerByIdInputPort.find(id);
		var customerResponse = customerMapper.toCustomerResponse(customer);
		return ResponseEntity.ok().body(customerResponse);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> update(@PathVariable final String id, @Valid @RequestBody CustomerRequest customerRequest) {
		Customer customer = customerMapper.toCustomer(customerRequest);
		customer.setId(id);
		updateCustomerInputPort.update(customer, customerRequest.getZipCode());
		return ResponseEntity.noContent().build();
	}

}
