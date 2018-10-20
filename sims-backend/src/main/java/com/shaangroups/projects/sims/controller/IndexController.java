package com.shaangroups.projects.sims.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class IndexController {

	@RequestMapping(value = "/")
	public String sayHello() {
		return "sims application index controller";
	}
}