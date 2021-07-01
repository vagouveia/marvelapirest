package br.com.zup.marvel.dto;

import java.util.Date;
import java.util.List;

public class EventDTO {
	
    private Long id;
    private String title;
    private String description;
    private String resourceURI;
    private List<UrlDTO> urls;
    private Date modified;
    private Date start;
    private Date end;
    private ImageDTO thumbnail;
    private ComicListDTO comicList;
    private StoryListDTO storyList;
    private SeriesListDTO seriesList;
    private CharacterListDTO characterList;
    private CreatorListDTO creatorList;
    private EventSummaryDTO next;
    private EventSummaryDTO previous;
    private Integer available;
    private Integer returned;
    private String collectionURI;
    private List<EventSummaryDTO> items;
    
	public EventDTO(Long id, String title, String description, String resourceURI, List<UrlDTO> urls,
			Date modified, Date start, Date end, ImageDTO thumbnail, ComicListDTO comicList,
			StoryListDTO storyList, SeriesListDTO seriesList, CharacterListDTO characterList,
			CreatorListDTO creatorList, EventSummaryDTO next, EventSummaryDTO previous, Integer available,
			Integer returned, String collectionURI, List<EventSummaryDTO> items) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.resourceURI = resourceURI;
		this.urls = urls;
		this.modified = modified;
		this.start = start;
		this.end = end;
		this.thumbnail = thumbnail;
		this.comicList = comicList;
		this.storyList = storyList;
		this.seriesList = seriesList;
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

	public Date getModified() {
		return modified;
	}

	public Date getStart() {
		return start;
	}

	public Date getEnd() {
		return end;
	}

	public ImageDTO getThumbnail() {
		return thumbnail;
	}

	public ComicListDTO getComicList() {
		return comicList;
	}

	public StoryListDTO getStoryList() {
		return storyList;
	}

	public SeriesListDTO getSeriesList() {
		return seriesList;
	}

	public CharacterListDTO getCharacterList() {
		return characterList;
	}

	public CreatorListDTO getCreatorList() {
		return creatorList;
	}

	public EventSummaryDTO getNext() {
		return next;
	}

	public EventSummaryDTO getPrevious() {
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

	public List<EventSummaryDTO> getItems() {
		return items;
	}

    
}
