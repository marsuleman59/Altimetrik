package com.company.test.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class AppService {
	
	
	@Autowired
	private RestTemplate http ;
	
	public String getData(String url,String queryParams){
		
		System.out.println("URL : " + url);
		String response = http.getForObject(url+ "?" + queryParams, String.class);

		return response;
		
		
		
	}
}
