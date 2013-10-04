package foo.nerz.bonboard.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import foo.nerz.bonboard.dao.PostDao;
import foo.nerz.bonboard.entity.Content;
import foo.nerz.bonboard.entity.Post;
import foo.nerz.bonboard.util.GenericController;

@Controller
@RequestMapping("/content")
public class ContentController extends GenericController {
	

	
	@Autowired
	PostDao postDao;
	
	
	
	
	
	@RequestMapping("/blog")
	 public String blog(Locale locale, Model model)
	 {
		
		
//		logger.debug(locale.getCountry());
//		logger.debug(locale.getDisplayCountry());
//		logger.debug(locale.getLanguage());
		
		//TODO supporto per la pagine variabile nella req ?page=1
		
		List<Post> blog=postDao.get10PostPaged(1, 1);
		
		List<Content> contents = new ArrayList<Content>();
		
		for(Post c:blog){
			contents.add(new Content(c, locale.getLanguage()));
		}
		

		
		
		
		model.addAttribute("contents", contents);
		
		//TODO supporto per la paginazione nella jsp
		
//		for(Post p : blog){
//			System.out.println(p.getTitoloIta());
//			System.out.println(p.getCountComments());
//		}
		
		
		//caricare le prime 10 pagine
		
		//controllare la lingua
		
		//popolare la jsp
		
	  return "blog";
	 }
	
	
	@RequestMapping("/press")
	 public String press()
	 {
		//caricare le prime 10 pagine
		
		//controllare la lingua
		
		//popolare la jsp
		
	  return "contact";
	 }
	
	
	@RequestMapping("/offerte")
	 public String offerte()
	 {
		//caricare le prime 10 pagine
		
		//controllare la lingua
		
		//popolare la jsp
		
	  return "contact";
	 }
	
	

}
