package com.iqmsoft.demo.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iqmsoft.demo.pojo.City;
import com.iqmsoft.demo.service.CityService;



@Controller
public class CityController {

	@Autowired
	private CityService cityService;

	@RequestMapping("/")
	public String list(Map<String, Object> model) {
		List<City> cities = cityService.list();
		model.put("city", cities);
		return "lists";
	}
}
