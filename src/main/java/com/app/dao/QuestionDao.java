package com.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.model.Question;

public interface QuestionDao extends CrudRepository<Question, Integer>{

//	 @Query("SELECT q FROM Question q WHERE q.qid=qid")
//	 Question find(@Param("qid") int qid);
}
