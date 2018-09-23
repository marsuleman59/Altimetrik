package com.company.test.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.company.test.app.constant.Constants;

import com.company.test.app.service.AppService;

//@Controller
@RestController
@CrossOrigin(origins = "*")
public class AppController {
	
	@Autowired
	private AppService service;
	
	@RequestMapping(method = RequestMethod.GET, path = "/events", produces = "application/json")
	  public String events(@RequestParam(name = "location") final String location){
		return service.getData(Constants.EVENT_URL,"token=ZH34DN3SOVDH4K266MXG&location.address="+location);
		
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/restrooms", produces = "application/json")
	  public String restrooms(@RequestParam(name = "isUnisex") final boolean isUnisex){
		return service.getData(Constants.REFUGE_URL,"unisex"+isUnisex);
		
	}
	
}
