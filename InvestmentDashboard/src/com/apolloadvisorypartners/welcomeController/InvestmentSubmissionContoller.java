package com.apolloadvisorypartners.welcomeController;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InvestmentSubmissionContoller {

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields(new String[] {"description"});
	}
	
	@ModelAttribute
	public void addingCommonObjects(Model model) {
		model.addAttribute("headerMessage", "Add Investment File");
	}
	
	@RequestMapping(value = "/addInvestmentFile", method = RequestMethod.GET)
	public ModelAndView addInvestmentFile() {
		ModelAndView modelAndView = new ModelAndView("addInvestmentFile");
		return modelAndView;
	}

	@RequestMapping(value = "/submitInvestmentFile", method = RequestMethod.POST)
	public ModelAndView submitInvestmentFile(@Valid @ModelAttribute ("investForm") InvestmentSubmissionForm investForm, BindingResult result) {
		if (result.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView("addInvestmentFile");
			return modelAndView;
		}
		
		ModelAndView modelAndView = new ModelAndView("addInvestmentFileSuccess");
		modelAndView.addObject("message", "Successfully added a file.");
		return modelAndView;
	}

}
