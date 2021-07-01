package br.com.zup.marvel.dto;


public class ComicPriceDTO {
	
    private String type;
    private float price;
    
	public ComicPriceDTO(String type, float price) {
		super();
		this.type = type;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public float getPrice() {
		return price;
	}

    
}
