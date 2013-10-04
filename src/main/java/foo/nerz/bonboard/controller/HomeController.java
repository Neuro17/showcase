package foo.nerz.bonboard.controller;


import java.util.Locale;


import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;


import foo.nerz.bonboard.util.GenericController;







/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("")
public class HomeController extends GenericController {
	

	
	
	@RequestMapping("contact")
	 public String welcome()
	 {
	  return "contact";
	 }


	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public ModelAndView home(Locale locale) {
		
		logger.debug("##### Auth "+SecurityContextHolder.getContext().getAuthentication().isAuthenticated());
		logger.debug("##### Auth "+SecurityContextHolder.getContext().getAuthentication().getAuthorities().toArray()[0]);

		ModelAndView model = new ModelAndView("home");
		
		
		return setHeader(model);

		
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView loregistergin(Locale locale) {
		
		
		ModelAndView model = new ModelAndView("register");
		return setHeader(model);
	}
	
	@RequestMapping(value = "/about/about_us", method = RequestMethod.GET)
	public ModelAndView aboutUs(Locale locale) {
		
		
		ModelAndView model = new ModelAndView("aboutUs");
		return setHeader(model);
	}
	
	@RequestMapping(value = "/about/advisory", method = RequestMethod.GET)
	public ModelAndView advisory(Locale locale) {
		
		
		ModelAndView model = new ModelAndView("advisory");
		return setHeader(model);
	}
	
	@RequestMapping(value = "/about/partners", method = RequestMethod.GET)
	public ModelAndView partners(Locale locale) {
		
		
		ModelAndView model = new ModelAndView("partners");
		return setHeader(model);
	}
	
	@RequestMapping(value = "/about/staff", method = RequestMethod.GET)
	public ModelAndView staff(Locale locale) {
		
		
		ModelAndView model = new ModelAndView("staff");
		return setHeader(model);
	}
	
	@RequestMapping(value = "/servizi/i_nostri_servizi_per_voi", method = RequestMethod.GET)
	public ModelAndView servizi(Locale locale) {
		
		
		ModelAndView model = new ModelAndView("servizi");
		return setHeader(model);
	}
	
	@RequestMapping(value = "/servizi/offerta_modulare", method = RequestMethod.GET)
	public ModelAndView modulare(Locale locale) {
		
		
		ModelAndView model = new ModelAndView("modulare");
		return setHeader(model);
	}
	
	@RequestMapping(value = "/servizi/personalizzazione_dei_servizi", method = RequestMethod.GET)
	public ModelAndView personalizzazione(Locale locale) {
		
		
		ModelAndView model = new ModelAndView("personalizzazione");
		return setHeader(model);
	}
	
	@RequestMapping(value = "/blog", method = RequestMethod.GET)
	public ModelAndView blog(Locale locale) {
		
		
		ModelAndView model = new ModelAndView("blog");
		return setHeader(model);
	}

	

	

	
//	@RequestMapping(value="page", method = RequestMethod.GET, params= "page")
//	public String getPage(@RequestParam(value = "page") String page){
//		logger.info("request for the page "+page);
//		
//		return "generated"+File.separator+page;
//	}
	
	
	
	
	
}
