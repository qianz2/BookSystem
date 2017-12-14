package org.springframework.orm.hibernate3;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

@SuppressWarnings("rawtypes")
public interface BaseDao<T> {
	HibernateTemplate getHibernateTemplate();

	Serializable save(T instance);

	void delete(T instance);

	void update(T instance);

	void saveOrUpdate(T instance);

	T findById(Serializable id);

	List<T> findAll();

	List<T> findByProperty(String propertyName, Object value);

	Object uniqueResult(final String hql, final Object... paras);

	List findByHql(String hql, Object... paras);

	Integer executeByHql(final String hql, final Object... paras);

	List findByHqlInCache(final String hql, final Object... paras);

	List findPage(final String hql, final int maxResult, final int firstResult,
			final Object... paras);

	List findBySQLQuery(final String sql, final Object... paras);
	
	/** *
	 * 分页查询
	 * @param hql 查询的条件
	 * @param offset 开始记录
	 * @param length 一次查询几条记录
	 * @return
	 */
	List queryForPage(final String hql,final int offset,final int length);

	/** *
	 * 查询所有记录数
	 * @param hql 查询的条件
	 * @return 总记录数
	 */
	int getAllRowCount(String hql);
}
