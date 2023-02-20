package com.webhook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class WebhookController {
	
//	@GetMapping("/hello")
//	public ResponseEntity<String> getMessage(){
//		
//		String msg="Hello IFTTT";
//		return new ResponseEntity<String>(msg,HttpStatus.OK);
//	}
	
	@GetMapping("/ifttt/v1/status")
	public ResponseEntity<String> serviceStatus(){
		
		String msg="Hello IFTTT";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}

}
