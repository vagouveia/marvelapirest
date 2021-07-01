package br.com.zup.marvel.dto;


public class TextObjectDTO {
	
    private String type;
    private String language;
    private String text;
    
	public TextObjectDTO(String type, String language, String text) {
		super();
		this.type = type;
		this.language = language;
		this.text = text;
	}

	public String getType() {
		return type;
	}

	public String getLanguage() {
		return language;
	}

	public String getText() {
		return text;
	}

    
}
