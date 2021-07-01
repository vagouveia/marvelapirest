package br.com.zup.marvel.dto;

import java.util.Date;
import java.util.List;

public class SeriesDTO {
	
    private Long id;
    private String title;
    private String description;
    private String resourceURI;
    private List<UrlDTO> urls;
    private Integer startYear;
    private Integer endYear;
    private String rating;
    private Date modified;
    private ImageDTO thumbnail;
    private ComicListDTO comicLists;
    private StoryListDTO storyLists;
    private EventListDTO eventLists;
    private CharacterListDTO characterList;
    private CreatorListDTO creatorList;
    private SeriesSummaryDTO next;
    private SeriesSummaryDTO previous;
    private Integer available;
    private Integer returned;
    private String collectionURI;
    private List<SeriesSummaryDTO> items;
    
	public SeriesDTO(Long id, String title, String description, String resourceURI, List<UrlDTO> urls,
			Integer startYear, Integer endYear, String rating, Date modified, ImageDTO thumbnail,
			ComicListDTO comicLists, StoryListDTO storyLists, EventListDTO eventLists, CharacterListDTO characterList,
			CreatorListDTO creatorList, SeriesSummaryDTO next, SeriesSummaryDTO previous, Integer available,
			Integer returned, String collectionURI, List<SeriesSummaryDTO> items) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.resourceURI = resourceURI;
		this.urls = urls;
		this.startYear = startYear;
		this.endYear = endYear;
		this.rating = rating;
		this.modified = modified;
		this.thumbnail = thumbnail;
		this.comicLists = comicLists;
		this.storyLists = storyLists;
		this.eventLists = eventLists;
		this.characterList = characterList;
		this.creatorList = creatorList;
		this.next = next;
		this.previous = previous;
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

	public List<UrlDTO> getUrls() {
		return urls;
	}

	public Integer getStartYear() {
		return startYear;
	}

	public Integer getEndYear() {
		return endYear;
	}

	public String getRating() {
		return rating;
	}

	public Date getModified() {
		return modified;
	}

	public ImageDTO getThumbnail() {
		return thumbnail;
	}

	public ComicListDTO getComicLists() {
		return comicLists;
	}

	public StoryListDTO getStoryLists() {
		return storyLists;
	}

	public EventListDTO getEventLists() {
		return eventLists;
	}

	public CharacterListDTO getCharacterList() {
		return characterList;
	}

	public CreatorListDTO getCreatorList() {
		return creatorList;
	}

	public SeriesSummaryDTO getNext() {
		return next;
	}

	public SeriesSummaryDTO getPrevious() {
		return previous;
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

	public List<SeriesSummaryDTO> getItems() {
		return items;
	}

    
    
}
