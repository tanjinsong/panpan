package com.panpan.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.panpan.admin.interfaceservice.TestInterface;

@Controller
public class TestController {

	@Autowired
	private TestInterface testInterface;
	
	@RequestMapping("/date")
	@ResponseBody
	public String queryCurrentDate(){
		
		return testInterface.queryCurrentDate();
	}
}
