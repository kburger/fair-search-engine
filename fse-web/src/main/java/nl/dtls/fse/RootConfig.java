package nl.dtls.fse;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class RootConfig {
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties(Environment env) {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();

		YamlPropertiesFactoryBean factory = new YamlPropertiesFactoryBean();
		factory.setResources(new ClassPathResource("default.yml"));

		configurer.setProperties(factory.getObject());

		return configurer;
	}
}
