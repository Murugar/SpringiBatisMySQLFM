package com.iqmsoft.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqmsoft.demo.mapper.CityMapper;
import com.iqmsoft.demo.pojo.City;



@Service
public class CityService {

	@Autowired
	private CityMapper cityMapper;
	
	
	public List<City> list(){
		return cityMapper.selectAll();
	}
	
	
}
