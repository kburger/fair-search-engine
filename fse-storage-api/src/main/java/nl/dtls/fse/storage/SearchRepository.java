package nl.dtls.fse.storage;

import java.util.Collection;

import nl.dtls.fse.model.SearchResult;

public interface SearchRepository {
	Collection<SearchResult> search(String query);
	
	Collection<Object> list();
}
