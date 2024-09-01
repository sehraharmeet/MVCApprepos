package com.harmeet.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainClass {

	 @GetMapping("/index")
	    public String index() {
	        return "index"; // Refers to WEB-INF/jsp/home.jsp
	    }
}
