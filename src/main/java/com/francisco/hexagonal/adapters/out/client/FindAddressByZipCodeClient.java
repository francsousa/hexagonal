package com.francisco.hexagonal.adapters.out.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.francisco.hexagonal.adapters.out.client.resonse.AddressResponse;

@FeignClient(
		name = "FindAddressByZipCodeClient",
		url = "${francisco.client.address.url}"
)
public interface FindAddressByZipCodeClient {
	
	@GetMapping("/{zipCode}")
	AddressResponse find(@PathVariable("zipCode") String zipCode);

}
