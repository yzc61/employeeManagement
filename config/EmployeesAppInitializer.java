package com.pika.em.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class EmployeesAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		Class[] configFiles = {EmployeesAppConfig.class};
		
		return configFiles;
	}

	@Override
	protected String[] getServletMappings() {

		String[] mappings = {"/"};
		
		return mappings;
	}

}
