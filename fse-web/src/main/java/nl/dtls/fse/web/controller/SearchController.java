package nl.dtls.fse.web.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nl.dtls.fse.model.SearchResult;
import nl.dtls.fse.service.SearchService;

@RestController
public class SearchController {
	private static final Logger logger = LoggerFactory.getLogger(SearchController.class);

	@Autowired
	private SearchService service;

	@GetMapping
	public Collection<SearchResult> search(@RequestParam("q") String query) {
		logger.info("Received request to search for {}", query);
		return service.search(query);
	}
}
