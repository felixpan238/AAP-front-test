package com.apolloadvisorypartners.welcomeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public ModelAndView welcome() {
		ModelAndView modelAndView = new ModelAndView("Welcome");
		modelAndView.addObject("welcomeMessage", "Welcome to Apollo Advisory Partner's Dashboard");
		return modelAndView;
	}
	
	@RequestMapping("/welcome/{userName}")
	public ModelAndView welcomeUsername(@PathVariable("userName") String userName) {
		ModelAndView modelAndView = new ModelAndView("Welcome");
		modelAndView.addObject("welcomeMessage", "Hi " + userName + ". Welcome to Apollo Advisory Partner's Dashboard");
		return modelAndView;
	}		

}
