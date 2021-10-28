package main.controllers;

import static org.springframework.http.ResponseEntity.ok;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import main.dto.CustomerResponseDTO;
import main.exceptions.CustomerNotFoundException;
import main.services.ClienteService;

@Slf4j
@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {
	
	private final ClienteService clienteService;
	
	@GetMapping("/{id}")
	public ResponseEntity<CustomerResponseDTO> get(@PathVariable long id) {
		
		log.debug("Try to get customer id {}", id);
		
		try {
			CustomerResponseDTO customerResponseDTO = this.clienteService.findById(id);
			
			log.debug("Successful response for customer with id {}", id);
			
			return ok(customerResponseDTO);
			
		} catch (CustomerNotFoundException e) {
			log.debug("Customer not found with id {}", id);
			
			return ResponseEntity.notFound().build();
		}
	}
}
