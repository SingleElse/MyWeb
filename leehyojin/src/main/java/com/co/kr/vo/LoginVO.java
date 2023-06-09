package com.co.kr.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class LoginVO {
	private String seq;
	private String id;
	private String pw;
	private String admin;
	private String level;
	
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
}