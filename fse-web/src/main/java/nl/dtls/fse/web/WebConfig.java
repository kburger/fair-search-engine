package nl.dtls.fse.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import nl.dtls.fse.service.ServiceConfig;
import nl.dtls.fse.storage.es.EsConfig;

@Configuration
@ComponentScan
@EnableWebMvc
@Import({ ServiceConfig.class, EsConfig.class })
public class WebConfig extends WebMvcConfigurerAdapter {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
	}
}
