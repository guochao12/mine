package com.ywl.model;

import java.util.Date;

public class Message
{
	private String mid;
	
	private String content;
	
	private Date expressDate;
	
	private User expresser;

	public User getExpresser()
	{
		return expresser;
	}

	public void setExpresser(User expresser)
	{
		this.expresser = expresser;
	}

	public String getMid()
	{
		return mid;
	}

	public void setMid(String mid)
	{
		this.mid = mid;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public Date getExpressDate()
	{
		return expressDate;
	}

	public void setExpressDate(Date expressDate)
	{
		this.expressDate = expressDate;
	}

}
