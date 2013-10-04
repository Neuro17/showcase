package foo.nerz.bonboard.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import foo.nerz.bonboard.dao.AuthoritiesDao;
import foo.nerz.bonboard.dao.UserDao;
import foo.nerz.bonboard.entity.Users;
import foo.nerz.bonboard.util.GenericController;


@Controller
@RequestMapping("/admin")
public class AdminController extends GenericController {

	@Autowired
	UserDao userDao;
	
	@Autowired
	AuthoritiesDao authDao;
	
	
	// BIAGIO qua è dove dovrai settare le variabili della pagina!
	// come si settano si vede in foo.nerz.bonboard.util.GenericController
	@RequestMapping(value = "dashboard", method = RequestMethod.GET)
	public ModelAndView home(Locale locale) {
		
		logger.debug("##### Auth "+SecurityContextHolder.getContext().getAuthentication().isAuthenticated());
		logger.debug("##### Auth "+SecurityContextHolder.getContext().getAuthentication().getAuthorities().toArray()[0]);

		// con questa funzione recupero l'oggetto con i dati dell'utente
		
		Users u=userDao.findById(getUsers().getUsername());
		List<Users> l=userDao.getUsersEnabled();
		
		//dopo li tiri fuori da u i dati
		logger.debug(u.getEmail());		
		
		ModelAndView model = new ModelAndView("dashboard");
		model.addObject("fName",u.getFname());
		model.addObject("lName",u.getLname());
		model.addObject("size", l.size());
		model.addObject("users", l);
		
		return setHeader(model);

		
	}
	
	@RequestMapping(value = "usersList", method = RequestMethod.GET)
	public ModelAndView homeS(Locale locale) {
		
		logger.debug("##### Auth "+SecurityContextHolder.getContext().getAuthentication().isAuthenticated());
		logger.debug("##### Auth "+SecurityContextHolder.getContext().getAuthentication().getAuthorities().toArray()[0]);

		// con questa funzione recupero l'oggetto con i dati dell'utente
		
		List<Users> l = userDao.getUsersEnabled();
		logger.debug(l.get(0).getAuth().get(0).getAuthority());
		
		//dopo li tiri fuori da u i dati
//		logger.debug(u.size());
//		logger.debug(u.getUsername());
//		logger.debug(u.getFname());
		
		
		ModelAndView model = new ModelAndView("usersList");
//		model.addObject("size", u.size());
//		model.addObject("fName",u.getFname());
//		model.addObject("lName",u.getLname());
			model.addObject("size", l.size());
			model.addObject("users", l);
		
		return setHeader(model);

		
	}
	
	@RequestMapping(value = "/changeAuth", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<String> existUsername(@RequestParam(value="user", required=true) String user
    							) {
		logger.debug("Received request to change the auth of the user "+user);
		
		authDao.changeAuthUser(user);
		
		return createJsonResponse( true );

	}
	
}
