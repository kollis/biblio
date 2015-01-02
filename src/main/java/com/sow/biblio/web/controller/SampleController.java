package com.sow.biblio.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/mvc")
public class SampleController {
	
	@Value("${testProp1}")
	private String testProp1;
	
	@RequestMapping("/sample.htm")
	public String printWelcome(ModelMap model) {
		
		System.out.println("\n*****in printWelcome testProp1:" + testProp1);
		
		return "sample";
	}
	
	@RequestMapping("/sample1.htm")
	public String sample1(ModelMap model) {
		
		return "sample1";
	}
	
}