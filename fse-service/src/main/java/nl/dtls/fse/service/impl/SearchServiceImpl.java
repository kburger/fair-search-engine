package nl.dtls.fse.service.impl;

import java.net.URL;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import nl.dtls.fse.crawler.lib.Crawler;
import nl.dtls.fse.crawler.lib.impl.CrawlerImpl;
import nl.dtls.fse.model.SearchResult;
import nl.dtls.fse.service.SearchService;
import nl.dtls.fse.storage.SearchRepository;

@Component
public class SearchServiceImpl implements SearchService {
	private static final Logger logger = LoggerFactory.getLogger(SearchServiceImpl.class);
	
	@Autowired
	private SearchRepository repository;
	
	private Crawler crawler;
	
	public SearchServiceImpl() {
		crawler = new CrawlerImpl();
	}

	@Override
	public Collection<SearchResult> search(String query) {
		logger.info("Searching for {}", query);
		
		return repository.search(query);
	}

	@Override
	public Collection<Object> list() {
		logger.info("Listing known endpoints");
		
		return repository.list();
	}

	@Override
	public void crawl(URL endpoint) {
		logger.info("Starting to crawl {}", endpoint);
		
		crawler.crawl(endpoint);
	}
}
