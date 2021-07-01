package br.com.zup.marvel.dto;

import java.util.Date;

public class ComicDateDTO {
	
    private String type;
    private Date date;
    
	public ComicDateDTO(String type, Date date) {
		super();
		this.type = type;
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public Date getDate() {
		return date;
	}
    
    

}
