package com.stanostrovskii.ec2demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/hello")
	public Message sayHello()
	{
		return new Message("Hello world!");
	}
	
	private class Message
	{
		public Message(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}

		private String message;

	}
}
