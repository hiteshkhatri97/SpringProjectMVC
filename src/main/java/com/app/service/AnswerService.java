package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.AnswerDao;
import com.app.model.Answer;

@Service
public class AnswerService {

	@Autowired
	AnswerDao ad;
	
	@Transactional
	public List<Answer> getAll(int qid) {
		
		List<Answer> a = ad.getAns(qid);
		return a;
	}

	@Transactional
	public void save(Answer answer) {

		ad.save(answer);
		
	}
	@Transactional
	public Answer get(int aid) {
		
		return ad.findOne(aid); 
	}
	
	
}
