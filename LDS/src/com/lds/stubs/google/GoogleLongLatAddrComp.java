package com.lds.stubs.google;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class GoogleLongLatAddrComp implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5226541092233552648L;
	
	private String long_name;
	private String short_name;
	private List<String> types;
	
	public String getLong_name() {
		return long_name;
	}
	public String getShort_name() {
		return short_name;
	}
	public List<String> getTypes() {
		if(types == null)
		{
			types = new ArrayList<String>();
		}
		return types;
	}
	public void setLong_name(String long_name) {
		this.long_name = long_name;
	}
	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}
	public void setTypes(List<String> types) {
		this.types = types;
	}

}
