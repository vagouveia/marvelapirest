package br.com.zup.marvel.dto;


public class CharacterSummaryDTO {
	
    private String resourceURI;
    private String name;
    private String role;
    
	public CharacterSummaryDTO(String resourceURI, String name, String role) {
		super();
		this.resourceURI = resourceURI;
		this.name = name;
		this.role = role;
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

    
}
