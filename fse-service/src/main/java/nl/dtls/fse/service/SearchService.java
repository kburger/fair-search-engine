package nl.dtls.fse.service;

import java.net.URL;
import java.util.Collection;

import nl.dtls.fse.model.SearchResult;

public interface SearchService {
	Collection<SearchResult> search(String query);
	
	Collection<Object> list();
	
	void crawl(URL endpoint);
}
