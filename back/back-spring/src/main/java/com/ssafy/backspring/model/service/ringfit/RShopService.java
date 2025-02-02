package com.ssafy.backspring.model.service.ringfit;

import java.util.List;

import com.ssafy.backspring.model.dto.ringfit.RShop;

public interface RShopService {
	public void insert(RShop rshop);
	public RShop search(int rshop_no);
	public List<RShop> searchAll();
	public void update(RShop rshop);
	public void delete(int rshop_no);
}
