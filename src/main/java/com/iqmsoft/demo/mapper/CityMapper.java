package com.iqmsoft.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.iqmsoft.demo.pojo.City;


@Mapper
public interface CityMapper {
	
	List<City> selectAll();
	
}
