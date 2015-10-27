package com.lds.stubs.google;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GoogleLongLatAddr implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1524736187382492067L;
	private List<GoogleLongLatAddrComp> address_components;
	private String formatted_address;
	private List<GoogleLongLatGeometry> geometry;
	private String place_id;
	private List<String> types;
	
	
	
	public List<GoogleLongLatAddrComp> getAddress_components() {
		if(address_components == null)
		{
			address_components = new ArrayList<GoogleLongLatAddrComp>();
		}
		return address_components;
	}
	public void setAddress_components(List<GoogleLongLatAddrComp> address_components) {
		this.address_components = address_components;
	}
	public String getFormatted_address() {
		return formatted_address;
	}
	public void setFormatted_address(String formatted_address) {
		this.formatted_address = formatted_address;
	}
	public List<GoogleLongLatGeometry> getGeometry() {
		if(geometry == null)
		{
			geometry = new ArrayList<GoogleLongLatGeometry>();
		}
		return geometry;
	}
	public void setGeometry(List<GoogleLongLatGeometry> geometry) {
		this.geometry = geometry;
	}
	public String getPlace_id() {
		return place_id;
	}
	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}
	public List<String> getTypes() {
		if(types == null)
		{
			types = new ArrayList<String>();
		}
		return types;
	}
	public void setTypes(List<String> types) {
		this.types = types;
	}
	
	

}
