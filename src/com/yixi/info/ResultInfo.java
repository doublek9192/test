package com.yixi.info;
public class ResultInfo 
{
	public String state="0";
	public String message="³É¹¦";
	public Object data=new Object();
	public Object getData()
	{
		return data;
	}
	public void setData(Object data)
	{
		this.data=data;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}