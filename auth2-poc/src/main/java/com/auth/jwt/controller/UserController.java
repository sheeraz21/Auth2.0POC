package com.auth.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World";
	}

}
