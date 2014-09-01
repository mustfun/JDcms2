package com.dzy.cms.base;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class BaseDaoImpl<T> implements BaseDao<T> {

	private Class clazz=null;   //这里为什么不像韩老师那样做呢
	//clazz不确定，但是子类是确定的，是吧！可以利用java的反射，好高级的样子
	@Resource
	private SessionFactory sessionFactory;
	
	public BaseDaoImpl() {
		//使用反射获取clazz,吊吧                                //接口new的是他的子类，子类代表this
		ParameterizedType pt=(ParameterizedType) this.getClass().getGenericSuperclass();//获取当前new的对象的 泛型父类
		this.clazz=(Class<T>) pt.getActualTypeArguments()[0]; //获取第一个类型参数的真实类型
		//System.out.println(this);谁被实例化了this就是代表谁，可以是任何一个domain类
	}
	
	/**
	 * 获取当前可用的session,protect子类也可以
	 */
	protected Session getMyCurrentSession()
	{
	
		return sessionFactory.getCurrentSession();
	}
	
	
	
	public void delete(int id) {
		Object obj=getById(id);
		if(obj!=null)
		{
			getMyCurrentSession().delete(obj);
		}
	}

	public List<T> findAll() {
		List<T> list=null;
		String hql="from "+clazz.getSimpleName();
		list=getMyCurrentSession().createQuery(hql).list();
		return list;
	}
	
	public List<T> findfirstpage()
	{
		return getMyCurrentSession().createQuery("from "+clazz.getSimpleName()).setMaxResults(8).list();
	}

	public T getById(int id) { 
		return (T) getMyCurrentSession().get(clazz, id);
	}
	
	public List<T> getByIds(Integer[] ids) {
		return getMyCurrentSession().createQuery("from "+clazz.getSimpleName()+" where id in (:ids)")
		.setParameterList("ids", ids).list();
	}

	public void save(T entity) {
		getMyCurrentSession().save(entity);
	}

	public void update(T entity) {
		getMyCurrentSession().update(entity);
	}

}
