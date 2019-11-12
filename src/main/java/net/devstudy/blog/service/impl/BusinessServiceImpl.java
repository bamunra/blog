package net.devstudy.blog.service.impl;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import javax.sql.DataSource;

import net.devstudy.blog.dao.SQLDAO;
import net.devstudy.blog.entity.Article;
import net.devstudy.blog.entity.Category;
import net.devstudy.blog.exception.ApplicationException;
import net.devstudy.blog.model.Items;
import net.devstudy.blog.service.BusinessService;

class BusinessServiceImpl implements BusinessService{

	private final DataSource dataSource;
	private final SQLDAO sql;
	
	
	
	BusinessServiceImpl(ServiceManager serviceManager) {
		super();
		this.dataSource = serviceManager.dataSource;
		this.sql = new SQLDAO();
//		try {
//			System.out.println(sql.countArticles(serviceManager.dataSource.getConnection()));
//			System.out.println(sql.listArticle(serviceManager.dataSource.getConnection(), 1, 1000));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}



	@Override
	public Map<Integer, Category> mapCategories() {
		try (Connection c = dataSource.getConnection()){
			return sql.mapCategories(c);
		} catch (SQLException e) {
			throw new ApplicationException("Can't execute db command: " + e.getMessage(), e);
		}
		
		
	}



	@Override
	public Items<Article> listArticles(int offset, int limit) {
		try (Connection c = dataSource.getConnection()){
			Items<Article> items = new Items<>();
			items.setItems(sql.listArticle(c, offset, limit));
			items.setCount(sql.countArticles(c));
			return items;
		} catch (SQLException e) {
			throw new ApplicationException("Can't execute db command: " + e.getMessage(), e);
		}
	}

}
