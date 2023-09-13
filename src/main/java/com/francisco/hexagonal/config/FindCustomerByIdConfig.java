package com.francisco.hexagonal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.francisco.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.francisco.hexagonal.application.core.usecase.FindCustomerByIdUseCase;

@Configuration
public class FindCustomerByIdConfig {
	
	@Bean
	public FindCustomerByIdUseCase findCustomerByIdUseCase(FindCustomerByIdAdapter findCustomerByIdAdapter) {
		return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
	}

}
