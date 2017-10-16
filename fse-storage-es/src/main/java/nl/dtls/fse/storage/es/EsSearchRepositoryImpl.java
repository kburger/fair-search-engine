package nl.dtls.fse.storage.es;

import java.io.IOException;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.searchbox.client.JestClient;
import nl.dtls.fse.model.SearchResult;
import nl.dtls.fse.storage.SearchRepository;

@Component
public class EsSearchRepositoryImpl implements SearchRepository {
	private static final Logger logger = LoggerFactory.getLogger(EsSearchRepositoryImpl.class);

	@Autowired
	private JestClient client;

	@Override
	public Collection<SearchResult> search(String query) {
		try {
			client.execute(null);
		} catch (IOException e) {
			logger.warn("Coult not execute ES request", e);
		}

		return null;
	}

	@Override
	public Collection<Object> list() {
		// TODO Auto-generated method stub
		return null;
	}
}
