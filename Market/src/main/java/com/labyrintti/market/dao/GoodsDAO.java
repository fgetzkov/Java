package com.labyrintti.market.dao;

import java.util.List;

import com.labyrintti.market.models.Goods;

public interface GoodsDAO {
	public void addGoods(Goods goods);

	public List<Goods> getAllGoods();

	public void deleteGoods(Integer GoodsId);

	public Goods updateGoods(Goods goods);

	public Goods getGoods(int goodsid);

}
