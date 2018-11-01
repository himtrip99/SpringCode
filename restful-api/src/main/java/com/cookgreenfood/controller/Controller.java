package com.cookgreenfood.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping(path="/api", method=RequestMethod.GET)
	public String getHelloFromRestApi() {
		return "Hello";
	}
	
}
