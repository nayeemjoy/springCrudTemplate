package com.nayeem.joy.dao;

import java.util.List;

public interface BaseDao {
	public void persist(Object obj);
	
	public <T> List<T> getAll(Class<T> clazz);
}
