package com.jua.repo.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import com.jua.model.Asset;
import com.jua.repo.AssetsRepository;

@Component
public class StaticAssetsRepository implements AssetsRepository {

	@Override
	public List<Asset> loadAll() {
		Asset oneAsset = new Asset("http://placehold.it/350x250/459ba8/fff/image2.jpg", "c1", "image", 350, 250);
		Asset twoAsset = new Asset("http://placehold.it/350x250/79c267/fff/image3.jpg", "c2", "image", 350, 250);
		Asset threeAsset = new Asset("https://cdn.hasselblad.com/samples/x1d-II-50c/x1d-II-sample-06.jpg", "", "image",
				250, 350);
		return Stream.of(oneAsset, twoAsset, threeAsset).collect(Collectors.toList());
	}

	@Override
	public List<Asset> LoadByFilter() {
		// TODO Auto-generated method stub
		return null;
	}

}
