package com.jua.repo;

import java.util.List;

import com.jua.model.NewsData;

public interface NewsRepository {

	List<NewsData> loadAll();

	List<NewsData> LoadByFilter();
}
