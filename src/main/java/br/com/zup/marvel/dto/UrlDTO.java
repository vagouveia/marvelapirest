package br.com.zup.marvel.dto;


public class UrlDTO {
	
    private Long id;
    private String type;
    private String url;
    
	public UrlDTO(Long id, String type, String url) {
		super();
		this.id = id;
		this.type = type;
		this.url = url;
	}

	public Long getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public String getUrl() {
		return url;
	}
	
	
    
    

 
}
