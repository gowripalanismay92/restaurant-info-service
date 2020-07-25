package com.altimetrik.zomato.restaurantinfoservice.transport;

import java.util.Date;

public class GenericResponse {
	
	private String status;
	private Date date;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
