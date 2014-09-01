package com.dzy.cms.base;

import java.util.List;

public interface BaseDao<T> {
	public void save(T entity);
	public void delete(int id);
	public void update(T entity);
	public T getById(int id);
	public List<T> findAll();
	public List<T> findfirstpage();
	/**
	 * 
	 * @param ids
	 * @return 通过一个id数组，返回很一个列表
	 */
	public List<T> getByIds(Integer ids[]);
	
	
}
