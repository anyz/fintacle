package com.fintacle.web.controller;

import java.security.Principal;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LandingController {

	private final Logger log = Logger.getLogger(this.getClass().getName());
	@RequestMapping("/home")
	public String launchHome(HttpServletRequest req, Model model, Principal principal) throws Exception {
		log.info("launching home page");
		Date date = new Date();		
		model.addAttribute("serverTime", date.toString() );
		return "home";
	}
}
