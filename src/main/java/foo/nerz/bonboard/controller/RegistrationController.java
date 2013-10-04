package foo.nerz.bonboard.controller;

import java.util.Locale;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import foo.nerz.bonboard.validator.UserValidation;
import foo.nerz.bonboard.validator.FieldMatchValidator;

@Controller
@RequestMapping(value="/prova")
public class RegistrationController {

	private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);	 
	 
	@RequestMapping(value="/registrationForm",method = RequestMethod.GET)
	public String modulare(Locale locale, ModelMap model) {
//			logger.info("Welcome blog insertion! The client locale is {}.", locale);
//			PostValidation valid= new PostValidation();
//			modello.put("blogForm", valid);
//			ModelAndView modell = new ModelAndView("blogForm");
		model.addAttribute("registrationForm",new UserValidation());
		return "registrationForm";
	} 
	
	
	 // Process the form.
	 @RequestMapping(value="/registrationForm",method = RequestMethod.POST)
	 public String processValidatinForm(@ModelAttribute("registrationForm") @Valid  UserValidation post,BindingResult result) {
		 if (result.hasErrors()) {
			 	logger.debug(result.getAllErrors().toString());
				return "registrationForm";
		} else {
			logger.debug(post.toString());
			return "home";
		}
		 
	 }
}