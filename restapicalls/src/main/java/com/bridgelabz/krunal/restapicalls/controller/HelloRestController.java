/************************************************************************************************
 * 
 * Purpose : UC1 : Create a Rest Controller to demonstrate the various HTTP Methods and respond 
 * 				   hello messages to the User. To begin with show Hello from BridgeLabz
 * 				   - Use GET Request Method
 * 				   - Use CURL to demonstrate the REST API Call
 * 				   - curl localhost:8080/hello -w "\n"
 * 
 * @author Krunal Lad
 * @since 09-08-2021
 * 
 ************************************************************************************************/
package com.bridgelabz.krunal.restapicalls.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	/**
	 * Purpose : When the request mapping is done the method sayHello is called and all statements
	 * 			 in the sayHello method gets executed
	 * 
	 * @return
	 */
	@RequestMapping(value = "/hello")
	public String sayHello() {
		return "Hello from Bridgelabz";
	}
}
