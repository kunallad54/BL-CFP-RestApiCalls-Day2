/************************************************************************************************
 * 
 * Purpose : UC5 : Make REST Call to show Hello Krunal Lad Welcome to BridgeLabz
 * 				   - Use PUT Request Method and pass first name as 
 * 					 Path Variable and last name as Query Parameter
 * 				   - Use CURL to demonstrate the REST API Call
 * 				   - curl -X PUT localhost:8080/hello/put/Krunal/?lastName=Lad -w "\n"
 * 
 * @author Krunal Lad
 * @since 09-08-2021
 * 
 ************************************************************************************************/
package com.bridgelabz.krunal.restapicalls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.krunal.restapicalls.model.UserInfo;

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
	
	/**
	 * Purpose : Annotation for mapping HTTP GET requests onto specific handler methods.
	 * 			When mapping is done the sayHello method is called and all statements are 
	 * 			executed
	 * 
	 * @param name 
	 * @return
	 */
	@GetMapping(value = "/getMessage")
	public String sayHello (@RequestParam(value = "name")String name) {
		return "Hello " + name + " Welcome to Bridgelabz";
	}
	
	/**
	 * Purpose : Use GET Request Method and pass name as path variable 
	 * 
	 * @param name
	 * @return
	 */
	@GetMapping(value = "/param/{name}")
	public String sayHelloParam(@PathVariable String name) {
		return  "Hello " + name + " Welcome to Bridelabz";
	}
	
	/**
	 * Purpose : Annotation for mapping HTTP POST requests onto specific handler methods.
	 * 			 Use POST Request Method and pass first name and last name in the Body.
	 * 			 Once the mapping takes place in the server, the sayHello() is called 
	 * 			 and the output message is displayed as output.
	 * 
	 * @param userInfo
	 * @return
	 */
	@PostMapping("/hello/post")
	public String sayHello(@RequestBody UserInfo userInfo) {
		return "Hello " + userInfo.getFirstName() + userInfo.getLastName() + " Welcome to Bridgelabz";
	}
	
	/**
	 * Purpose : Annotation for mapping HTTP PUT requests onto specific handler methods.
	 * 			 Use PUT Request Method and pass first name as Path Variable and last name as Query Parameter.
	 * 			 Once the mapping takes place in the server, the sayHello() is called and the output message is
	 * 			 displayed as output.
	 * 
	 * @param firstName
	 * @param lastName
	 * @return
	 */
	@PutMapping("/hello/put/{firstName}")
	public String sayHello(@PathVariable String firstName, @RequestParam (value = "lastName") String lastName) {
		return "Hello " + firstName + " " + lastName + " Welcome to BridgeLabz";
	}
	
}
