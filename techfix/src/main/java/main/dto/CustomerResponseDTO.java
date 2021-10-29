package main.dto;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import lombok.Getter;

@Getter
@JsonInclude(Include.NON_NULL)
public class CustomerResponseDTO {

	private long id;
	
	private String nome;
	
	private String email;
	
	public static CustomerResponseDTO deserialize(Object object) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JavaTimeModule());
		mapper.configure(FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		return mapper.convertValue(object, CustomerResponseDTO.class);
	}
}
