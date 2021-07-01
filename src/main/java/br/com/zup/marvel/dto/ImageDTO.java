package br.com.zup.marvel.dto;


public class ImageDTO {
	
    private String path;
    private String extension;
    
	public ImageDTO(String path, String extension) {
		super();
		this.path = path;
		this.extension = extension;
	}

	public String getPath() {
		return path;
	}

	public String getExtension() {
		return extension;
	}

    
}
