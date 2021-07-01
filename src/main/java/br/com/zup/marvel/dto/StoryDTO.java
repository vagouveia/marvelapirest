package br.com.zup.marvel.dto;

import java.util.Date;
import java.util.List;

public class StoryDTO {
	
    private Long id;
    private String title;
    private String description;
    private String resourceURI;
    private String type;
    private Date modified;
    private ImageDTO thumbnail;
    private ComicListDTO comicList;
    private SeriesListDTO seriesList;
    private EventListDTO eventList;
    private CharacterListDTO characterList;
    private CreatorListDTO creatorList;
    private ComicSummaryDTO originalIssue;
    private Integer available;
    private Integer returned;
    private String collectionURI;
    private List<StorySummaryDTO> items;
    
	public StoryDTO(Long id, String title, String description, String resourceURI, String type, Date modified,
			ImageDTO thumbnail, ComicListDTO comicList, SeriesListDTO seriesList, EventListDTO eventList,
			CharacterListDTO characterList, CreatorListDTO creatorList, ComicSummaryDTO originalIssue,
			Integer available, Integer returned, String collectionURI, List<StorySummaryDTO> items) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.resourceURI = resourceURI;
		this.type = type;
		this.modified = modified;
		this.thumbnail = thumbnail;
		this.comicList = comicList;
		this.seriesList = seriesList;
		this.eventList = eventList;
		this.characterList = characterList;
		this.creatorList = creatorList;
		this.originalIssue = originalIssue;
		this.available = available;
		this.returned = returned;
		this.collectionURI = collectionURI;
		this.items = items;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public String getType() {
		return type;
	}

	public Date getModified() {
		return modified;
	}

	public ImageDTO getThumbnail() {
		return thumbnail;
	}

	public ComicListDTO getComicList() {
		return comicList;
	}

	public SeriesListDTO getSeriesList() {
		return seriesList;
	}

	public EventListDTO getEventList() {
		return eventList;
	}

	public CharacterListDTO getCharacterList() {
		return characterList;
	}

	public CreatorListDTO getCreatorList() {
		return creatorList;
	}

	public ComicSummaryDTO getOriginalIssue() {
		return originalIssue;
	}

	public Integer getAvailable() {
		return available;
	}

	public Integer getReturned() {
		return returned;
	}

	public String getCollectionURI() {
		return collectionURI;
	}

	public List<StorySummaryDTO> getItems() {
		return items;
	}
    
 
}
