package com.altimetrik.zomato.restaurantinfoservice.transport;

public class FailureResponse extends GenericResponse {
	
	private String errorMsgId;
	private String errorMsgDesc;
	
	public String getErrorMsgId() {
		return errorMsgId;
	}
	public void setErrorMsgId(String errorMsgId) {
		this.errorMsgId = errorMsgId;
	}
	public String getErrorMsgDesc() {
		return errorMsgDesc;
	}
	public void setErrorMsgDesc(String errorMsgDesc) {
		this.errorMsgDesc = errorMsgDesc;
	}
	
	

}

