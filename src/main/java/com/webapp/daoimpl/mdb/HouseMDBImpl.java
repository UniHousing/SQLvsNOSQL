package com.webapp.daoimpl.mdb;


import java.util.List;

import com.webapp.dao.HouseDao;
import com.webapp.model.House;

public class HouseMDBImpl extends BaseMDBImpl<House> implements HouseDao{

	@Override
	public List<House> findByType(String typeString) {
		// TODO Auto-generated method stub
		Parameter parameter = new Parameter();
		parameter.put("type", typeString);
		return findAll(parameter);
	}

	
}