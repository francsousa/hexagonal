package com.francisco.hexagonal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.francisco.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.francisco.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.francisco.hexagonal.application.core.usecase.FindCustomerByIdUseCase;

@Configuration
public class DeleteCustomerByIdConfig {
	
	@Bean
	public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
			FindCustomerByIdUseCase findCustomerByIdUseCase, 
			DeleteCustomerByIdAdapter deleteCustomerByIdAdapter) {
		
		return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
	}

}
