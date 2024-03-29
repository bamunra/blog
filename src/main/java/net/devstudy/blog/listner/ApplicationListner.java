package net.devstudy.blog.listner;



import java.util.Map;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.devstudy.blog.Constants;
import net.devstudy.blog.entity.Category;
import net.devstudy.blog.service.impl.ServiceManager;


@WebListener
public class ApplicationListner implements ServletContextListener {

	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationListner.class);
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServiceManager serviceManager = ServiceManager.getInstance(sce.getServletContext());
		Map<Integer, Category> map = serviceManager.getBusinessService().mapCategories();
		sce.getServletContext().setAttribute(Constants.CATEGORY_MAP, map);
		LOGGER.info("Application started");

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		ServiceManager.getInstance(sce.getServletContext()).destroy();
		LOGGER.info("Application destroyed");

	}

}
