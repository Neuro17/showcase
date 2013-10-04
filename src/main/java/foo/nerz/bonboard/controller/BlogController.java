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

import foo.nerz.bonboard.validator.PostValidation;

@Controller
@RequestMapping(value="/form")
public class BlogController {

	private static final Logger logger = LoggerFactory.getLogger(BlogController.class);
	
	
	
	
//	@RequestMapping(value="/blogForm",method = RequestMethod.GET)
//	public String modulare(Locale locale, Model model) {
////		logger.info("Welcome blog insertion! The client locale is {}.", locale);
////		PostValidation valid= new PostValidation();
////		modello.put("blogForm", valid);
////		ModelAndView modell = new ModelAndView("blogForm");
//		model.addAttribute("blogForm",new PostValidation());
//		return "blogForm";
//	} 
//	
//	
//	 // Process the form.
//	 @RequestMapping(value="/blogForm",method = RequestMethod.POST)
//	 public String processValidatinForm(@Valid @ModelAttribute("blogForm") PostValidation post, 
//			 BindingResult result,  
//            Model model) {
//	  System.out.println(post.getTitleEng());
//	  return "home";
//	 }
	 
	 
	 
		@RequestMapping(value="/blogForm",method = RequestMethod.GET)
		public String modulare(Locale locale, ModelMap model) {
//			logger.info("Welcome blog insertion! The client locale is {}.", locale);
//			PostValidation valid= new PostValidation();
//			modello.put("blogForm", valid);
//			ModelAndView modell = new ModelAndView("blogForm");
			model.addAttribute("blogForm",new PostValidation());
			return "blogForm";
		} 
		
		
		 // Process the form.
		 @RequestMapping(value="/blogForm",method = RequestMethod.POST)
		 public String processValidatinForm(@ModelAttribute("blogForm") @Valid  PostValidation post, 
				 BindingResult result 
	            ) {
			 if (result.hasErrors()) {
				 	logger.debug(result.getAllErrors().toString());
					return "blogForm";
				} else {
					logger.debug(post.toString());
					return "home";
				}
			 
			 
		  
		 }
	
	
	
	
	
}
