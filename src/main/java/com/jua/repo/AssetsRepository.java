package com.jua.repo;

import java.util.List;

import com.jua.model.Asset;

public interface AssetsRepository {

	List<Asset> loadAll();

	List<Asset> LoadByFilter();

}
