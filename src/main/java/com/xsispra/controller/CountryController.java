package com.xsispra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CountryController {

	@RequestMapping("/country")
	public String country() {
		return "country/country";
	}
	
}
