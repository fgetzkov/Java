package com.labyrintti.market.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.labyrintti.market.models.Goods;
import com.labyrintti.market.services.GoodsService;

@Controller
public class MarketController {

	@Autowired
	private GoodsService goodsService;

	@RequestMapping(value = "/")
	public ModelAndView listGoods(ModelAndView model) throws IOException {

		List<Goods> listGoods = goodsService.getAllGoods();
		model.addObject("listGoods", listGoods);
		model.setViewName("home");

		return model;
	}

	@RequestMapping(value = "/newGoods", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {

		Goods goods = new Goods();
		model.addObject("goods", goods);
		model.setViewName("GoodsForm");

		return model;
	}

	@RequestMapping(value = "/saveGoods", method = RequestMethod.POST)
	public ModelAndView saveGoods(@ModelAttribute Goods goods) {

		if (goods.getName() != null && goods.getAmount() > 0) {

			if (goods.getId() == 0) { // if goods id is 0 then creating the
				// goods other updating the goods
				goodsService.addGoods(goods);
			} else {
				goodsService.updateGoods(goods);
			}

			return new ModelAndView("redirect:/");
		} else {
			return new ModelAndView("redirect:/Error");
		}
	}

	@RequestMapping(value = "/deleteGoods", method = RequestMethod.GET)
	public ModelAndView deleteGoods(HttpServletRequest request) {

		int goodsId = Integer.parseInt(request.getParameter("id"));
		goodsService.deleteGoods(goodsId);

		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editGoods", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {

		int goodsId = Integer.parseInt(request.getParameter("id"));
		Goods goods = goodsService.getGoods(goodsId);
		ModelAndView model = new ModelAndView("GoodsForm");
		model.addObject("goods", goods);

		return model;
	}

	@RequestMapping(value = "/Error")
	public ModelAndView Error(ModelAndView model) throws IOException {

		model.setViewName("Error");

		return model;
	}

}
