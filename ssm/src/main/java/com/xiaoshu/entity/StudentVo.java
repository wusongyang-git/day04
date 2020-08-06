package com.xiaoshu.entity;

import java.util.Date;

import javax.persistence.Column;

import org.springframework.format.annotation.DateTimeFormat;

public class StudentVo extends Student {

	private String mName;
	
	 

	@DateTimeFormat(pattern="yyyy-MM-dd")
	
	    private Date sBirth1;

	   @DateTimeFormat(pattern="yyyy-MM-dd")
	 
	    private Date sBirth2;


	public Date getsBirth1() {
		return sBirth1;
	}

	public void setsBirth1(Date sBirth1) {
		this.sBirth1 = sBirth1;
	}

	public Date getsBirth2() {
		return sBirth2;
	}

	public void setsBirth2(Date sBirth2) {
		this.sBirth2 = sBirth2;
	}

	  public String getmName() {
			return mName;
		}

		public void setmName(String mName) {
			this.mName = mName;
		}
}
