package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.QuestionDao;
import com.app.model.Question;

@Service
public class QuestionService {

	
	@Autowired
	QuestionDao qd;
	@Transactional
	public void save(Question q) {
		qd.save(q);
	}
	@Transactional
	public List<Question> getAll() {

		List<Question> l = (List<Question>) qd.findAll();
		
		return l;
	}
	public Question getQue(int qid) {
		return qd.findOne(qid);
	}
	
	
	
}
