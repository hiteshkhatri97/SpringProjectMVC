package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Answer")
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AID")
	private int aid;
	

	@Column(name = "ANS")
	private String ans;
	
	@Column
	private int lk;
	@Column
	private int dislk;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Question que;
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
	
	

	public Answer(int aid, String ans, int lk, int dislk, Question que, User user) {
		super();
		this.aid = aid;
		this.ans = ans;
		this.lk = lk;
		this.dislk = dislk;
		this.que = que;
		this.user = user;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int getLk() {
		return lk;
	}

	public void setLk(int lk) {
		this.lk = lk;
	}

	public int getDislk() {
		return dislk;
	}

	public void setDislk(int dislk) {
		this.dislk = dislk;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}


	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public Question getQue() {
		return que;
	}

	public void setQue(Question que) {
		this.que = que;
	}

	@Override
	public String toString() {
		return "Answer [aid=" + aid + ", ans=" + ans + ", lk=" + lk + ", dislk=" + dislk + ", que=" + que + ", user="
				+ user + "]";
	}

	

}
