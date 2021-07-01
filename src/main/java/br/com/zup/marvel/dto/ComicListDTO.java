package br.com.zup.marvel.dto;

import java.util.List;

public class ComicListDTO {
	
    private Integer available;
    private String collectionURI;
    private List<ComicSummaryDTO> items;
    private Integer returned;
    
	public ComicListDTO(Integer available, String collectionURI, List<ComicSummaryDTO> items, Integer returned) {
		super();
		this.available = available;
		this.collectionURI = collectionURI;
		this.items = items;
		this.returned = returned;
	}

	public Integer getAvailable() {
		return available;
	}

	public String getCollectionURI() {
		return collectionURI;
	}

	public List<ComicSummaryDTO> getItems() {
		return items;
	}

	public Integer getReturned() {
		return returned;
	}

    
    
}
