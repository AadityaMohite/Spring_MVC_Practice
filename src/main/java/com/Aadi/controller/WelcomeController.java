package com.Aadi.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("/Welcome")
	public String Welcome(Model model) {
		
		model.addAttribute("msg", "hello Iam from Mumbai");
		
		
		return "Welcome";
	}
	
	
	@GetMapping("/greet")
	public String Greet(Model model) {
		
		model.addAttribute("names", Arrays.asList("Aaditya","Raj","Ramesh"));
		return "Greet";
	}
	
	
}
