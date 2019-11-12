package net.devstudy.blog.service;

import java.util.Map;

import net.devstudy.blog.entity.Category;
import net.devstudy.blog.entity.Article;
import net.devstudy.blog.model.Items;

public interface BusinessService {

	Map<Integer, Category> mapCategories();	
	
	Items<Article> listArticles(int offset, int limit);
	
}
