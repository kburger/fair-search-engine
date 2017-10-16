package nl.dtls.fse.crawler.cli;

import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import nl.dtls.fse.crawler.lib.Crawler;
import nl.dtls.fse.crawler.lib.impl.CrawlerImpl;

public class CrawlerCli {
	private static final Logger logger = LoggerFactory.getLogger(CrawlerCli.class);
	
	public static void main(String[] args) throws Exception {
		logger.info("CLI interface for the crawler v0.1");
		
		Crawler crawler = new CrawlerImpl();
		crawler.crawl(new URL("http://example.com/"));
	}
}
