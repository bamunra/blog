package net.devstudy.blog.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppUtil {
	public static void loadProperties(Properties props, String classPathUrl) {
		try (InputStream in = AppUtil.class.getClassLoader().getResourceAsStream(classPathUrl)){
			
            if (in == null) {
                System.out.println("Sorry, unable to find " + classPathUrl);
                return;
            }

			props.load(in);
			System.out.println(props);

		} catch (IOException e) {
			throw new IllegalArgumentException("Can't load properties from classpath:" + classPathUrl, e);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
