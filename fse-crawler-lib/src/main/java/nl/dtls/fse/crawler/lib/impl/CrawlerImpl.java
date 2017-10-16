package nl.dtls.fse.crawler.lib.impl;

import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import nl.dtls.fse.crawler.lib.Crawler;

public class CrawlerImpl implements Crawler {
	private static final Logger logger = LoggerFactory.getLogger(CrawlerImpl.class);
	
	@Override
	public void crawl(URL endpoint) {
		logger.info("now crawling {}", endpoint);
	}
}
