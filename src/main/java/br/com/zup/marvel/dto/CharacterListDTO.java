package br.com.zup.marvel.dto;

import java.util.List;

public class CharacterListDTO {
	
    private Integer available;
    private Integer returned;
    private String collectionURI;
    private List<CharacterSummaryDTO> items;
    
	public CharacterListDTO(Integer available, Integer returned, String collectionURI,
			List<CharacterSummaryDTO> items) {
		super();
		this.available = available;
		this.returned = returned;
		this.collectionURI = collectionURI;
		this.items = items;
	}

	public Integer getAvailable() {
		return available;
	}

	public Integer getReturned() {
		return returned;
	}

	public String getCollectionURI() {
		return collectionURI;
	}

	public List<CharacterSummaryDTO> getItems() {
		return items;
	}

    
}
