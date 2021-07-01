package br.com.zup.marvel.dto;


public class EventSummaryDTO {
	
    private Long id;
    private String resourceURI;
    private String name;
    
	public EventSummaryDTO(Long id, String resourceURI, String name) {
		super();
		this.id = id;
		this.resourceURI = resourceURI;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public String getName() {
		return name;
	}

	
  
}
