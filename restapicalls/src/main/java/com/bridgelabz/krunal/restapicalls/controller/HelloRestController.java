/************************************************************************************************
 * 
 * Purpose : UC3 : Make REST Call to show Hello Krunal Welcome to BridgeLabz
 * 				   - Use GET Request Method and pass name as path variable
 * 				   - Use CURL to demonstrate the REST API Call
 * 				   - curl localhost:8080/hello/param/Krunal -w "\n"
 * 
 * @author Krunal Lad
 * @since 09-08-2021
 * 
 ************************************************************************************************/
package com.bridgelabz.krunal.restapicalls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	
	
}
