package com.jua.model;

public class NewsData {
	public NewsData(String title, String category, String url, String summary) {
		super();
		this.title = title;
		this.category = category;
		this.url = url;
		this.summary = summary;
	}

	private String title;
	private String category;
	private String url;
	private String summary;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

}
