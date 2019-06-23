package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.app.model.Answer;

public interface AnswerDao extends CrudRepository<Answer, Integer> {

	
	@Query("SELECT a FROM Answer a WHERE a.que.qid=:qid")
	List<Answer> getAns(@Param("qid") int qid);

}
