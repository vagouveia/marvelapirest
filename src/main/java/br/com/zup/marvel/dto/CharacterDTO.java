package br.com.zup.marvel.dto;

import java.util.Date;
import java.util.List;

public class CharacterDTO {
	
    private Long id;
    private String name;
    private String description;
    private Date modified;
    private String resourceURI;
    private ImageDTO thumbnail;
    private List<UrlDTO> urls;
    private ComicDTO comic;
    private StoryDTO story;
    private EventDTO event;
    private SeriesDTO series;
    
	public CharacterDTO(Long id, String name, String description, Date modified, String resourceURI,
			ImageDTO thumbnail, List<UrlDTO> urls, ComicDTO comic, StoryDTO story, EventDTO event, SeriesDTO series) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.modified = modified;
		this.resourceURI = resourceURI;
		this.thumbnail = thumbnail;
		this.urls = urls;
		this.comic = comic;
		this.story = story;
		this.event = event;
		this.series = series;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Date getModified() {
		return modified;
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public ImageDTO getThumbnail() {
		return thumbnail;
	}

	public List<UrlDTO> getUrls() {
		return urls;
	}

	public ComicDTO getComic() {
		return comic;
	}

	public StoryDTO getStory() {
		return story;
	}

	public EventDTO getEvent() {
		return event;
	}

	public SeriesDTO getSeries() {
		return series;
	}
    
    
    
}