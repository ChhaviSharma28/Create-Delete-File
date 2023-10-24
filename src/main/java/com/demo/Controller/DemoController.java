package com.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	@GetMapping(value = "/siteHealth")
	
	public String getSiteHealth() {
		System.out.println("enter in conroller class");
		return "The site is up!!";
	}
	
	@GetMapping(value = "/upload/{filename}")
	public ResponseEntity<String> getUploadFile(@PathVariable("filename") String filename) throws Exception{
		ResponseEntity<String> response = null;
		String result = demoService.getInputUploadFile(filename);
		response = new ResponseEntity<String>(result, HttpStatus.OK);
		return response;
	}
	
	@GetMapping(value = "/delete/{filename}")
	public ResponseEntity<String> getDeleteFile(@PathVariable("filename") String filename) throws Exception{
		ResponseEntity<String> response = null;
		String result = demoService.getInputDeleteFile(filename);
		response = new ResponseEntity<String>(result, HttpStatus.OK);
		return response;
	}

}
