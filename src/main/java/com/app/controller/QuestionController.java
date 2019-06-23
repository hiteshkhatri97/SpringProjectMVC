package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Answer;
import com.app.model.Question;
import com.app.model.User;
import com.app.service.QuestionService;
import com.app.service.UserService;

@RestController
public class QuestionController {

	@Autowired
	QuestionService qs;
	@Autowired
	UserService us;
	@GetMapping("/question")
	public ModelAndView getAll(@ModelAttribute("ans") Answer answer) {
		
		List<Question> l = qs.getAll();
		ModelAndView m  = new ModelAndView("Question");
		m.addObject("list", l);
		return m;
	}
	
	@GetMapping("/askquestion")
	public ModelAndView showQueForm() {
		
		
		return new ModelAndView("askQuestion","ask",new Question());
	}
	@PostMapping("/saveque")
	public ModelAndView save(@ModelAttribute("ask") Question que,HttpSession session) {
		
		int id = (int) session.getAttribute("UserId");
		User user = new User();
		user.setId(id);
		que.setUser(user);
		qs.save(que);
		return new ModelAndView("redirect:/question");
	}
	
}
