package com.jeho.echo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.xray.spring.aop.XRayEnabled;

@RestController
@RequestMapping(value = "/rest")
public class EchoController {

	@RequestMapping(value = "/v1/echo", method = RequestMethod.GET) 
	public String echo() {
		return "Hello!!!";
	}
}
