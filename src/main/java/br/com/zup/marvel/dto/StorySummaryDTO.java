package br.com.zup.marvel.dto;


public class StorySummaryDTO {
	
    private Long id;
    private String resourceURI;
    private String name;
    private String type;
    
	public StorySummaryDTO(Long id, String resourceURI, String name, String type) {
		super();
		this.id = id;
		this.resourceURI = resourceURI;
		this.name = name;
		this.type = type;
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

	public String getType() {
		return type;
	}

    
}
