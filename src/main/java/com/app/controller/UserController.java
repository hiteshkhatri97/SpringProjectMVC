package com.app.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.User;
import com.app.service.UserService;

@RestController
@Controller
public class UserController {
	

	@Autowired
	private UserService ps;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView loadMainPage() {
		return new ModelAndView("index","login",new User());
	}

	
	@GetMapping("/register")
	public ModelAndView Register(ModelMap model) {

		
		model.addAttribute("messege","Welcome to Registeration form");
		return new ModelAndView("Register","person",new User());
	}

	@RequestMapping(value = "/addPerson", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("person") User person) {
		ps.save(person);
		return new ModelAndView("redirect:/");
	}
	@PostMapping("/loginuser")
	public ModelAndView login(@ModelAttribute("login") User user,HttpServletRequest req) {
		User user1 = ps.login(user);
		if(user!=null){
		
			System.out.println("Session="+user1.getId());
			HttpSession session = req.getSession(false);
			session.setAttribute("UserId", user1.getId());
			return new ModelAndView("redirect:/question");
		}
		else
			return new ModelAndView("redirect:/");
	}
}
