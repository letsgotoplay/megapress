package com.jua.repo.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.jua.model.NewsData;
import com.jua.repo.NewsRepository;

@Component
public class StatisNewsRepository implements NewsRepository {

	@Override
	public List<NewsData> loadAll() {
		List<NewsData> result = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			NewsData a = new NewsData("test1a" + i, "people-strategy", "https://url.com", "this is the summary");
			result.add(a);
		}
		return result;
	}

	@Override
	public List<NewsData> LoadByFilter() {
		return null;
	}

}
