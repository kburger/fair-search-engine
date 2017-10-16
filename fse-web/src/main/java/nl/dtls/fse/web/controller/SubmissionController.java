package nl.dtls.fse.web.controller;

import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.dtls.fse.service.SearchService;

@RestController
@RequestMapping("/submit")
public class SubmissionController {
	private static final Logger logger = LoggerFactory.getLogger(SubmissionController.class);

	@Autowired
	private SearchService service;

	@PostMapping
	public void submit(@RequestBody URL endpoint) {
		logger.info("Received request for submission of {}", endpoint);

		service.crawl(endpoint);
	}
}
