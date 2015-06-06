package com.ywl.model;

import java.util.Date;

public class Card
{
	private String cid;
	
	private String replyId;
	
	private Date expressDate;
	
	private int contentType;
	
	private String content;
	
	private Multimedia media;

	public String getCid()
	{
		return cid;
	}

	public void setCid(String cid)
	{
		this.cid = cid;
	}

	public String getReplyId()
	{
		return replyId;
	}

	public void setReplyId(String replyId)
	{
		this.replyId = replyId;
	}

	public Date getExpressDate()
	{
		return expressDate;
	}

	public void setExpressDate(Date expressDate)
	{
		this.expressDate = expressDate;
	}

	public int getContentType()
	{
		return contentType;
	}

	public void setContentType(int contentType)
	{
		this.contentType = contentType;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public Multimedia getMedia()
	{
		return media;
	}

	public void setMedia(Multimedia media)
	{
		this.media = media;
	}
}
