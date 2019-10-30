package net.devstudy.blog.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class AppUtil {
	public static void loadProperties(Properties props, String classPathUrl) {
		try (InputStream in = AppUtil.class.getClassLoader().getResourceAsStream(classPathUrl)){
			
			System.out.println(classPathUrl);
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String str = reader.readLine();
			System.out.println(str);

			props.load(in);
			System.out.println(props);

		} catch (IOException e) {
			throw new IllegalArgumentException("Can't load properties from classpath:" + classPathUrl, e);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
