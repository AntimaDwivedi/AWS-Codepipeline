package com.awsECR.ecrlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.json.JSONObject;

@SpringBootApplication
@RestController
public class EcrlearningApplication {

	@GetMapping("/")
	public String message()
	{
		JSONObject resp = new JSONObject();
		String response="Hello , World !!";
		resp.put("message",response );
		return resp.toString();
	}
	public static void main(String[] args) {
		SpringApplication.run(EcrlearningApplication.class, args);
	}


}
