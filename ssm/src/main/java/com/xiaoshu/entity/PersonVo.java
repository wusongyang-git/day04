package com.xiaoshu.entity;

import java.util.Date;

import javax.persistence.Column;

import org.springframework.format.annotation.DateTimeFormat;

public class PersonVo extends Person{

	 private String cName; 
	



	@DateTimeFormat(pattern="yyyy-MM-dd")
	 private Date entryTime1;
	 
	 @DateTimeFormat(pattern="yyyy-MM-dd")	   
	 private Date entryTime2;

	
	 
	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Date getEntryTime1() {
		return entryTime1;
	}

	public void setEntryTime1(Date entryTime1) {
		this.entryTime1 = entryTime1;
	}

	public Date getEntryTime2() {
		return entryTime2;
	}

	public void setEntryTime2(Date entryTime2) {
		this.entryTime2 = entryTime2;
	}
	
}
