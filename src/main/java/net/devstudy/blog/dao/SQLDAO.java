package net.devstudy.blog.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import net.devstudy.blog.dao.mapper.ArticleMapper;
import net.devstudy.blog.dao.mapper.ListMapper;
import net.devstudy.blog.dao.mapper.MapCategoryMapper;
import net.devstudy.blog.entity.Category;
import net.devstudy.blog.entity.Article;


public final class SQLDAO {
	private final QueryRunner sql = new QueryRunner();
	
	public Map<Integer, Category> mapCategories(Connection c) throws SQLException {
		return sql.query(c, "select * from category", new MapCategoryMapper());
	}
	
	public List<Article> listArticle(Connection c, int offset, int limit) throws SQLException {
		return sql.query(c, "select * from article a order by a.id desc limit ? offset ?", new ListMapper<>(new ArticleMapper()),limit, offset);
	}
	
	public int countArticles(Connection c) throws SQLException{
		return sql.query(c, "select count(*) from article a", new ScalarHandler<Number>()).intValue(); 
	}
}
