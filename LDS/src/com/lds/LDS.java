package com.lds;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import com.lds.stubs.Person;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

@Path("/LDS")
public class LDS {
	
	public Client client;
	public WebResource webResource;
//	https://maps.googleapis.com/maps/api/geocode/json?latlng=40.714224,-73.961452
	public final String GOOGLE_GEOLOC_LONG_LAT = "https://maps.googleapis.com/maps/api/geocode/json?latlng=";
	
	public LDS()
	{
		
	}
	
	
	@GET
	@Path("/test/{param}")	
	public String getTest(@PathParam("param") String param)
	{		
		return param;
	}
	
	@GET
	@Path("/get/long/lat/{lng}/{lat}")
	public String getZip(@PathParam("lng")String lng, @PathParam("lat")String lat)
	{
		System.out.println("**************Lng and Lat: " + lng + "," + lat);
		String response = "Empty";
		client = Client.create();
		webResource = client.resource(GOOGLE_GEOLOC_LONG_LAT + lng + "," + lat);
		
		response = webResource.type(MediaType.APPLICATION_JSON).get(String.class);
		
		
		return response;
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
