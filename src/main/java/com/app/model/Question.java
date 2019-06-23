package com.app.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Question")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="QID")
	private int qid;
	@Column(name="QUE")
	private String que;
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
	
	@OneToMany(mappedBy = "que", cascade = CascadeType.ALL)
	private Set<Answer> ans;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Question(int qid, int aid, int lid, String question) {
		super();
		this.qid = qid;
		this.que = question;
	}
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}


	public String getQue() {
		return que;
	}

	public void setQue(String que) {
		this.que = que;
	}

	@Override
	public String toString() {
		return "Question [qid=" + qid + ", que=" + que + ", user=" + user + ", ans=" + ans + "]";
	}
	
	
}
