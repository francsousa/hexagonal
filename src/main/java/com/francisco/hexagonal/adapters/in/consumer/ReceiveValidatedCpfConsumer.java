package com.francisco.hexagonal.adapters.in.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.francisco.hexagonal.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.francisco.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.francisco.hexagonal.application.ports.in.UpdateCustomerInputPort;

@Component
public class ReceiveValidatedCpfConsumer {

	@Autowired
	private UpdateCustomerInputPort updateCustomerInputPort;

	@Autowired
	private CustomerMessageMapper customerMessageMapper;

	@KafkaListener(topics = "tp-cpf-validated", groupId = "francisco")
	public void receive(CustomerMessage customerMessage) {
		var customer = customerMessageMapper.toCustomer(customerMessage);
		updateCustomerInputPort.update(customer, customerMessage.getZipCode());
	}

}
