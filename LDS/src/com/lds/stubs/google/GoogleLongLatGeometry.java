package com.lds.stubs.google;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GoogleLongLatGeometry implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5649357556005664923L;
	private List<GoogleLongLatLocation> location;
	private String location_type;
	private Viewport viewport;
	
	public List<GoogleLongLatLocation> getLocation() {
		if(location == null)
		{
			location = new ArrayList<GoogleLongLatLocation>();
		}
		return location;
	}
	public void setLocation(List<GoogleLongLatLocation> location) {
		this.location = location;
	}
	public String getLocation_type() {
		return location_type;
	}
	public Viewport getViewport() {
		return viewport;
	}
	public void setLocation_type(String location_type) {
		this.location_type = location_type;
	}
	public void setViewport(Viewport viewport) {
		this.viewport = viewport;
	}
	
}
