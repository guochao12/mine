package com.ywl.model;

import java.util.List;

public abstract class Lib
{
	private String name;
	
	private List<MultimediaWrapper> medias;
	
	private String libId;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public List<MultimediaWrapper> getMedias()
	{
		return medias;
	}

	public void setMedias(List<MultimediaWrapper> medias)
	{
		this.medias = medias;
	}

	public String getLibId()
	{
		return libId;
	}

	public void setLibId(String libId)
	{
		this.libId = libId;
	}
	
	public void add(MultimediaWrapper media)
	{
		medias.add(media);
	}
}
