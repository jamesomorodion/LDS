package com.lds.stubs.google;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GoogleLongLatResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9074974207533971299L;
	private List<GoogleLongLatAddr> results;
	private String status;
	
	
	
	
	public List<GoogleLongLatAddr> getResults() {
		if(results == null)
		{
			results = new ArrayList<GoogleLongLatAddr>();
		}
		return results;
	}
	public void setResults(List<GoogleLongLatAddr> results) {
		this.results = results;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
