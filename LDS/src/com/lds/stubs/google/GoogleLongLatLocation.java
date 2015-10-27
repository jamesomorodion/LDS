package com.lds.stubs.google;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GoogleLongLatLocation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8085551444381967775L;

	private double lat;
	private double lng;
	
	public double getLat() {
		return lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
}
