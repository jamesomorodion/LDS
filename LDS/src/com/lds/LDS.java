package com.lds;

import javax.jws.WebService;

import com.lds.stubs.Person;

@WebService
public class LDS {
	
	public String getZip(String lng, String lat)
	{
		String zip = "";
		
		
		return zip;
	}
	
	public boolean setLocation(String lng, String lat)
	{
		boolean status = false;
		
		return status;
	}
	
	public Person getDemographics()
	{
		Person p = new Person();
		
		return p;
	}

}
