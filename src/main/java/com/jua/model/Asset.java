package com.jua.model;

public class Asset {

	public Asset(String src, String category, String type, Integer height, Integer width) {
		super();
		this.src = src;
		this.category = category;
		this.type = type;
		this.setHeight(height);
		this.setWidth(width);
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	private String src;
	private String category;
	private String type = "image";
	private Integer height;
	private Integer width;
}
