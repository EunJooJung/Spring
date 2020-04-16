package com.mvc.update.model.dto;

import java.sql.Date;

public class JdbcDto {
	
	private int seq;
	private String writer;
	private String title;
	private String content;
	private Date refdate;
	
	
	public JdbcDto() {
		
	}


	public JdbcDto(int seq, String writer, String title, String content, Date refdate) {
		super();
		this.seq = seq;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.refdate = refdate;
	}


	public int getSeq() {
		return seq;
	}


	public void setSeq(int seq) {
		this.seq = seq;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Date getRefdate() {
		return refdate;
	}


	public void setRefdate(Date refdate) {
		this.refdate = refdate;
	}
	
	

}
