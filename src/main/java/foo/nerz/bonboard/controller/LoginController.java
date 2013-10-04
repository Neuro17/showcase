package foo.nerz.bonboard.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;






import com.google.gson.Gson;

import foo.nerz.bonboard.BonbException;
import foo.nerz.bonboard.dao.AuthoritiesDao;
import foo.nerz.bonboard.dao.UserDao;
import foo.nerz.bonboard.entity.Authorities;
import foo.nerz.bonboard.entity.GenderEnum;
import foo.nerz.bonboard.entity.Users;
import foo.nerz.bonboard.util.GenericController;


//TODO controllare i redirect con il login e l'autenticazione

@Controller
public class LoginController extends GenericController {
	
	
	@Autowired
	UserDao userDao;
	@Autowired
	AuthoritiesDao authDao;
	
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<String> login(Locale locale, ModelMap model) {
		
		
		String name =SecurityContextHolder.getContext().getAuthentication().getName();
	     
		
		return createJsonResponse(name);
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<String> logout(Locale locale, ModelMap model) {
		
		
//		String name =SecurityContextHolder.getContext().getAuthentication().getName();
	     
		
		return createJsonResponse(true);
	}
	
	@RequestMapping(value="/loginfailed", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<String> loginerror(ModelMap model) {
 
		
		
		return createJsonResponse("Error Authentication");
 
	}
	
	

	
	//funziona bisogna vedere come passagli i parametri dal client
	
	@RequestMapping(value = "request/newUser", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<String> newUser(@RequestParam(value="username", required=true) String username,
														@RequestParam(value="email", required=true) String email,
														@RequestParam(value="password", required=true) String password,
														@RequestParam(value="fname", required=true) String fname,
														@RequestParam(value="lname", required=true) String lname,
														@RequestParam(value="gender", required=true) String gender,
														Model model) throws BonbException {
		logger.info("Adding User Request");
		
		logger.info(username);
		
		GenderEnum gen = null; 
		if(gender.compareTo("M") == 0)
			gen = GenderEnum.M;
		else if(gender.compareTo("F") == 0)
			gen = GenderEnum.F;
		
		Users u=new Users(username, password , true, email, fname, lname, gen);
		Authorities a=new Authorities(u, "ROLE_USER");
		
		userDao.addUser(u);
		
		authDao.saveA(a);
 		
		
		//TODO redirict whet the page is working
		return createJsonResponse( true );
	}
	
	
	//TODO testing 
	
	@RequestMapping(value = "/getUser", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<String> getUser(														
														Model model) {
		logger.info("Test");
		
		User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		

 		
		return createJsonResponse( user.getUsername() );
	}
	
	/* Funziona, il path è
	 * localhost:8080/bonboard/existUsername?username=prova
	 * 
	 */
	
	@RequestMapping(value = "/existUsername", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<String> existUsername(@RequestParam(value="username", required=true) String username,
    							
    							Model model) {
		logger.debug("Received request controll if exist "+username);
		
		return createJsonResponse( userDao.existUsername(username) );

	}
	
	/* Funziona, il path è
	 * localhost:8080/bonboard/existMail?mail=a@.it
	 * 
	 */
	
	@RequestMapping(value = "/existMail", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<String> existMail(@RequestParam(value="mail", required=true) String mail,
    							
    							Model model) {
		logger.debug("Received request controll if exist the mail "+mail);
		
		return createJsonResponse( userDao.existMail(mail) );

	}
	
	


}
