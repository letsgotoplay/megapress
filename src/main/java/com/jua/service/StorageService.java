package com.jua.service;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jua.model.Asset;
import com.jua.model.Sample;
import com.jua.model.Template;
import com.jua.repo.AssetsRepository;
import com.jua.repo.NewsRepository;

@Service
public class StorageService {
	private ConcurrentHashMap<String, Template> templateDraft = new ConcurrentHashMap<>();
	@Autowired
	private AssetsRepository assetsRepository;
	@Autowired
	private NewsRepository newsRepository;

	public void save(Template payload) {
		templateDraft.put("last", payload);
	}

	public Template getlast() {
		return templateDraft.get("last");
	}

	public Sample getSampleData() {
		Sample result = new Sample();
		result.setData(newsRepository.loadAll());
		return result;

	}

	public List<Asset> getAssets() {
		return assetsRepository.loadAll();
	}

	public Template getByTemplateName(String templateName) {
		return templateDraft.get(templateName);

	}

}
