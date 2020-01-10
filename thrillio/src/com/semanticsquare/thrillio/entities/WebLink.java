package com.semanticsquare.thrillio.entities;

public class WebLink extends Bookmark{
	
	//WebLink variables
	private String url;
	private String host;
	
	//getter and setter methods
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	@Override
	public String toString() {
		return "WebLink [url=" + url + ", host=" + host + "]";
	}
}
