package br.com.zup.marvel.dto;


public class SeriesSummaryDTO {
	
    private Long id;
    private String resourceURI;
    private String name;
    
	public SeriesSummaryDTO(Long id, String resourceURI, String name) {
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
