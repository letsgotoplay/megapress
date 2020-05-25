package com.jua.model;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	private List<NewsData> data = new ArrayList<>();

	public List<NewsData> getData() {
		return this.data;
	}

	public void setData(List<NewsData> data) {
		this.data = data;
	}

	public void addData(NewsData e) {
		data.add(e);
	}
}
