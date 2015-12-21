package com.lds;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.lds.stubs.Person;
import com.lds.stubs.google.GoogleLongLatAddr;
import com.lds.stubs.google.GoogleLongLatResponse;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

@Path("/LDS")
public class LDS {
	
	public Client client;
	public WebResource webResource;
	
	
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
	@Path("/get/lat/lng/{lat}/{lng}")
	@Produces(MediaType.APPLICATION_JSON)
	public GoogleLongLatResponse getLocation(@PathParam("lat")String lat, @PathParam("lng")String lng)
	{
		System.out.println("**************Lng and Lat: " + lng + "," + lat);
		
		String address = null;
		GoogleLongLatResponse response = null;
		client = Client.create();
		webResource = client.resource(LDSConstants.GOOGLE_GEOLOC_LONG_LAT + lat + "," + lng);
		
		response = webResource.type(MediaType.APPLICATION_JSON).get(GoogleLongLatResponse.class);
		for(GoogleLongLatAddr adr : response.getResults())
		{
			for(String type : adr.getTypes()){
				if(type != null && (LDSConstants.STREET_ADDRESS.equals(type) || LDSConstants.PREMISE.equals(type)))
				{
					address = adr.getFormatted_address();
				}
			}
		}
		
		String msg = "For Longitude: " + lng + " Latitude: " + lat + ", your address is: " + address;
		
		response = new GoogleLongLatResponse();
		response.setMessage(msg);
		
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
