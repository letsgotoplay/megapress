package com.jua.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jua.model.Asset;
import com.jua.model.Sample;
import com.jua.model.Template;
import com.jua.service.StorageService;

@RestController
public class TemplateController {
	@Autowired
	private StorageService storageService;

	@GetMapping("/load-template")
	public Template load(@RequestParam(required = false) String templateName) {
		if (null != templateName) {
			return storageService.getByTemplateName(templateName);
		}
		return storageService.getlast();
	}

	@PostMapping("/store-template")
	public void store(@RequestBody Template payload) {
		storageService.save(payload);
	}

	@GetMapping("/sample")
	public Sample sample() {
		return storageService.getSampleData();
	}

	@GetMapping("/assets")
	public List<Asset> assets() {
		return storageService.getAssets();
	}

}
