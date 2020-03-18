package com.nttdata.teambest.bestpackersandmovers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Redirects the home page
 * 
 * @author SHUMBC
 *
 */
@Controller
public class IndexController {

	@GetMapping("/home")
	public String getHomePage() {
		return "Just a test not working now Home page called";
	}

}
