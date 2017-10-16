package nl.dtls.fse.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import nl.dtls.fse.RootConfig;

public class ServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return array(RootConfig.class, WebConfig.class);
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return array("/");
	}

	@SafeVarargs
	private static <T> T[] array(T... array) {
		return array;
	}
}
