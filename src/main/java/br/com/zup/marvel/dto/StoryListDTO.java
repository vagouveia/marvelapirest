package br.com.zup.marvel.dto;

import java.util.List;

public class StoryListDTO {
	
    private Integer available;
    private String collectionURI;
    private List<StorySummaryDTO> items;
    private Integer returned;
    
	public StoryListDTO(Integer available, String collectionURI, List<StorySummaryDTO> items, Integer returned) {
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

	public List<StorySummaryDTO> getItems() {
		return items;
	}

	public Integer getReturned() {
		return returned;
	}

   
}
