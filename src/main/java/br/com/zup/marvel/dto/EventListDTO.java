package br.com.zup.marvel.dto;

import java.util.List;

public class EventListDTO {
	
    private Integer available;
    private String collectionURI;
    private List<EventSummaryDTO> items;
    private Integer returned;
    
	public EventListDTO(Integer available, String collectionURI, List<EventSummaryDTO> items, Integer returned) {
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

	public List<EventSummaryDTO> getItems() {
		return items;
	}

	public Integer getReturned() {
		return returned;
	}


    
}
