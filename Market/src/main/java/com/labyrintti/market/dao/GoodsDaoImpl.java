package com.labyrintti.market.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.labyrintti.market.models.Goods;

@Repository
public class GoodsDaoImpl implements GoodsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addGoods(Goods goods) {
		sessionFactory.getCurrentSession().saveOrUpdate(goods);

	}

	@SuppressWarnings("unchecked")
	public List<Goods> getAllGoods() {
		return sessionFactory.getCurrentSession().createQuery("from Goods").list();
	}

	public void deleteGoods(Integer goodsId) {
		Goods goods = (Goods) sessionFactory.getCurrentSession().load(Goods.class, goodsId);
		if (null != goods) {
			this.sessionFactory.getCurrentSession().delete(goods);
		}
	}

	public Goods updateGoods(Goods goods) {
		sessionFactory.getCurrentSession().update(goods);
		return goods;
	}

	public Goods getGoods(int goodsid) {
		return (Goods) sessionFactory.getCurrentSession().get(Goods.class, goodsid);
	}

}
