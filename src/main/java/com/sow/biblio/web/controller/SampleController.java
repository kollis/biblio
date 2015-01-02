package com.sow.biblio.web.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/mvc")
public class SampleController {
	
	@Value("${testProp1}")
	private String testProp1;
	
	@Resource
	private MessageSource messageSource;
	
	@RequestMapping("/sample.htm")
	public String printWelcome(ModelMap model) {
				
		String testMsg = messageSource.getMessage("testMsg", null, null);
		
		System.out.println("\n*****in printWelcome testProp1, testMsg:" + testProp1 + ", " + testMsg);
		
		return "sample";
	}
	
	@RequestMapping("/sample1.htm")
	public String sample1(ModelMap model) {
		
		return "sample1";
	}
	
}