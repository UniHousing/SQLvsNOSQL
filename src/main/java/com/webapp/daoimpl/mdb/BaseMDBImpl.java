package com.webapp.daoimpl.mdb;


import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

import com.webapp.dao.BaseDao;

@Component
public class BaseMDBImpl<T> implements BaseDao<T>  {

	@Resource(name = "mongoTemplate")
	public MongoOperations mongoTemplate;

	
	@Override
	public T get(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findAll(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(List<T> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
		
	}
	
	
}
