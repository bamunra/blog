package net.devstudy.blog.controller.page;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.devstudy.blog.controller.AbstractController;
import net.devstudy.blog.entity.Article;
import net.devstudy.blog.model.Items;
import net.devstudy.blog.Constants;

@WebServlet({"/news","/news/*"})
public class NewsController extends AbstractController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 216595477139640552L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestUrl = req.getRequestURI();
		Items<Article> items = null;
		if (requestUrl.endsWith("/news")||requestUrl.endsWith("/news/")) {
			items = getBusinessService().listArticles(0, Constants.LIMIT_ARTICLES_PER_PAGE);
		} else {
			//TODO
		}
		
		req.setAttribute("list", items.getItems());
		forvardToPage("news.jsp", req, resp);
	}
	
	
}
