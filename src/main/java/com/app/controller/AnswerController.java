package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Answer;
import com.app.model.Question;
import com.app.model.User;
import com.app.service.AnswerService;
import com.app.service.QuestionService;

@RestController
public class AnswerController {

	@Autowired
	AnswerService as;
	@Autowired
	QuestionService qs;
	
	@RequestMapping(value="/answer", method= { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView takeAnswer(@RequestParam("qid") int qId, ModelMap m) {
		System.out.println(qId);
		List<Answer> l = as.getAll(qId);
		Question que = qs.getQue(qId);
		m.addAttribute("list", l);
		m.addAttribute("que", que);
		return new ModelAndView("Answer","subans", new Answer());
	}
	
	
	@PostMapping("/saveans")
	public ModelAndView saveans(@ModelAttribute("subans") Answer answer,@RequestParam("n") int qid, HttpSession session) {
		
		int id = (int) session.getAttribute("UserId");
		User user = new User();
		user.setId(id);
		answer.setUser(user);
		Question que = new Question();
		que.setQid(qid);
		answer.setQue(que);
		as.save(answer);
		return new ModelAndView("redirect:/answer?qid="+qid);
	}
	
	@PostMapping("/liked")
	public void saveLike(@RequestParam("aid") int aid) {
		
		Answer answer = as.get(aid);
		answer.setLk(1);
		answer.setDislk(0);
		as.save(answer);
	}
	
	@PostMapping("/disliked")
	public void saveDisLike(@RequestParam("aid") int aid) {
		
		Answer answer = as.get(aid);
		answer.setDislk(1);
		answer.setLk(0);
		as.save(answer);
	}
	
}
