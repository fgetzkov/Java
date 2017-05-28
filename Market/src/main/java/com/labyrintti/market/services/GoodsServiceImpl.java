package com.labyrintti.market.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.labyrintti.market.dao.GoodsDAO;
import com.labyrintti.market.models.Goods;

@Service
@Transactional
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsDAO goodsDAO;

	@Transactional
	public void addGoods(Goods goods) {
		goodsDAO.addGoods(goods);
	}

	@Transactional
	public List<Goods> getAllGoods() {
		return goodsDAO.getAllGoods();
	}

	@Transactional
	public void deleteGoods(Integer goodsId) {
		goodsDAO.deleteGoods(goodsId);
	}

	public Goods getGoods(int goodsid) {
		return goodsDAO.getGoods(goodsid);
	}

	public Goods updateGoods(Goods goods) {
		return goodsDAO.updateGoods(goods);
	}

	public void setGoodsDAO(GoodsDAO goodsDAO) {
		this.goodsDAO = goodsDAO;
	}

}
