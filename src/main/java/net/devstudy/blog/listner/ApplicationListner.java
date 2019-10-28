package net.devstudy.blog.listner;



import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@WebListener
public class ApplicationListner implements ServletContextListener {

	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationListner.class);
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		LOGGER.info("Application started");

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		LOGGER.info("Application destroyed");

	}

}
