package br.com.zup.marvel.dto;

import java.util.List;

public class SeriesListDTO {
	
    private Integer available;
    private String collectionURI;
    private List<SeriesSummaryDTO> items;
    private Integer returned;
    
	public SeriesListDTO(Integer available, String collectionURI, List<SeriesSummaryDTO> items, Integer returned) {
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

	public List<SeriesSummaryDTO> getItems() {
		return items;
	}

	public Integer getReturned() {
		return returned;
	}

   
}
