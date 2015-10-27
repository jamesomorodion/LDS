package com.lds.stubs.google;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Viewport implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6742533543534537777L;
	private GoogleLongLatLocation northeast;
	private GoogleLongLatLocation southwest;
	
	public GoogleLongLatLocation getNortheast() {
		return northeast;
	}
	public GoogleLongLatLocation getSouthwest() {
		return southwest;
	}
	public void setNortheast(GoogleLongLatLocation northeast) {
		this.northeast = northeast;
	}
	public void setSouthwest(GoogleLongLatLocation southwest) {
		this.southwest = southwest;
	}

}
