package com.ywl.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class User
{
	private String userId;
	
	private String username;
	
	private String password;
	
	private Multimedia potrait;
	
	private Date regDate;
	
	private List<Message> messageBoard;
	
	private Map<String, List<User>> friends;
	
	private List<Card> cards;
	
	private List<Lib> libs;

	public String getUserId()
	{
		return userId;
	}

	public void setUserId(String userId)
	{
		this.userId = userId;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public Multimedia getPotrait()
	{
		return potrait;
	}

	public void setPotrait(Multimedia potrait)
	{
		this.potrait = potrait;
	}

	public Date getRegDate()
	{
		return regDate;
	}

	public void setRegDate(Date regDate)
	{
		this.regDate = regDate;
	}

	public List<Message> getMessageBoard()
	{
		return messageBoard;
	}

	public void setMessageBoard(List<Message> messageBoard)
	{
		this.messageBoard = messageBoard;
	}

	public Map<String, List<User>> getFriends()
	{
		return friends;
	}

	public void setFriends(Map<String, List<User>> friends)
	{
		this.friends = friends;
	}

	public List<Card> getCards()
	{
		return cards;
	}

	public void setCards(List<Card> cards)
	{
		this.cards = cards;
	}

	public List<Lib> getLibs()
	{
		return libs;
	}

	public void setLibs(List<Lib> libs)
	{
		this.libs = libs;
	}
}
