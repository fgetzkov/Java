package com.labyrintti.market.services;

import java.util.List;

import com.labyrintti.market.models.Goods;

public interface GoodsService {
	public void addGoods(Goods goods);

	public List<Goods> getAllGoods();

	public void deleteGoods(Integer goodsId);

	public Goods getGoods(int goodsid);

	public Goods updateGoods(Goods goods);

}
