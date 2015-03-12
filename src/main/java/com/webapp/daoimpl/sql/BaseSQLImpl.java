package com.webapp.daoimpl.sql;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.webapp.common.util.Reflections;
import com.webapp.dao.BaseDao;
import com.webapp.model.House;

@Component
public abstract class BaseSQLImpl<T> implements BaseDao<T> {

	@Autowired
	protected JdbcTemplate jdbcTemplate;

	private Class<?> entityClass;

	public BaseSQLImpl() {
		this.entityClass = Reflections.getClassGenricType(getClass());
	}

	public Class<?> getEntityClass() {
		return this.entityClass;
	}

	@Override
	public T findById(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findAll(String qlstr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("delete from " + entityClass.getSimpleName()
				+ " where id=?", id);
	}
	

	@Override
	public void update(String qlstr) {
		// TODO Auto-generated method stub

	}


}
