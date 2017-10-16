package nl.dtls.fse.storage.es;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import io.searchbox.client.JestClient;
import io.searchbox.client.JestClientFactory;
import io.searchbox.client.config.HttpClientConfig;

@Configuration
@ComponentScan
public class EsConfig {
	@Bean(destroyMethod = "close")
	public JestClient client(@Value("${fse.storage.es.server}") String esServer) {
		JestClientFactory factory = new JestClientFactory();
		
		HttpClientConfig config = new HttpClientConfig.Builder(esServer)
				.build();
		
		factory.setHttpClientConfig(config);
		
		return factory.getObject();
	}
}
