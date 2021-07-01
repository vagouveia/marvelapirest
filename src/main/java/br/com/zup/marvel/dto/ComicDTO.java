package br.com.zup.marvel.dto;

import java.util.Date;
import java.util.List;

public class ComicDTO {
	
    private Long id;
    private Long digitalId;
    private String title;
    private Double issueNumber;
    private String variantDescription;
    private String description;
    private Date modified;
    private String isbn;
    private String upc;
    private String diamondCode;
    private String ean;
    private String issn;
    private String format;
    private Integer pageCount;
    private List<TextObjectDTO> textObjects;
    private String resourceURI;
    private List<UrlDTO> urls;
    private SeriesSummaryDTO series;
    private List<ComicSummaryDTO> variants;
    private List<ComicSummaryDTO> collections;
    private List<ComicSummaryDTO> collectedIssues;
    private List<ComicDateDTO> dates;
    private List<ComicPriceDTO> prices;
    private ImageDTO thumbnail;
    private CreatorListDTO creators;
    private CharacterListDTO characters;
    private StoryListDTO stories;
    private EventListDTO events;
    private Integer available;
    private Integer returned;
    private String collectionURI;
    private List<ComicSummaryDTO> items;
    
	public ComicDTO(Long id, Long digitalId, String title, Double issueNumber, String variantDescription,
			String description, Date modified, String isbn, String upc, String diamondCode, String ean,
			String issn, String format, Integer pageCount, List<TextObjectDTO> textObjects, String resourceURI,
			List<UrlDTO> urls, SeriesSummaryDTO series, List<ComicSummaryDTO> variants,
			List<ComicSummaryDTO> collections, List<ComicSummaryDTO> collectedIssues, List<ComicDateDTO> dates,
			List<ComicPriceDTO> prices, ImageDTO thumbnail, CreatorListDTO creators, CharacterListDTO characters,
			StoryListDTO stories, EventListDTO events, Integer available, Integer returned, String collectionURI,
			List<ComicSummaryDTO> items) {
		super();
		this.id = id;
		this.digitalId = digitalId;
		this.title = title;
		this.issueNumber = issueNumber;
		this.variantDescription = variantDescription;
		this.description = description;
		this.modified = modified;
		this.isbn = isbn;
		this.upc = upc;
		this.diamondCode = diamondCode;
		this.ean = ean;
		this.issn = issn;
		this.format = format;
		this.pageCount = pageCount;
		this.textObjects = textObjects;
		this.resourceURI = resourceURI;
		this.urls = urls;
		this.series = series;
		this.variants = variants;
		this.collections = collections;
		this.collectedIssues = collectedIssues;
		this.dates = dates;
		this.prices = prices;
		this.thumbnail = thumbnail;
		this.creators = creators;
		this.characters = characters;
		this.stories = stories;
		this.events = events;
		this.available = available;
		this.returned = returned;
		this.collectionURI = collectionURI;
		this.items = items;
	}

	public Long getId() {
		return id;
	}

	public Long getDigitalId() {
		return digitalId;
	}

	public String getTitle() {
		return title;
	}

	public Double getIssueNumber() {
		return issueNumber;
	}

	public String getVariantDescription() {
		return variantDescription;
	}

	public String getDescription() {
		return description;
	}

	public Date getModified() {
		return modified;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getUpc() {
		return upc;
	}

	public String getDiamondCode() {
		return diamondCode;
	}

	public String getEan() {
		return ean;
	}

	public String getIssn() {
		return issn;
	}

	public String getFormat() {
		return format;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public List<TextObjectDTO> getTextObjects() {
		return textObjects;
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public List<UrlDTO> getUrls() {
		return urls;
	}

	public SeriesSummaryDTO getSeries() {
		return series;
	}

	public List<ComicSummaryDTO> getVariants() {
		return variants;
	}

	public List<ComicSummaryDTO> getCollections() {
		return collections;
	}

	public List<ComicSummaryDTO> getCollectedIssues() {
		return collectedIssues;
	}

	public List<ComicDateDTO> getDates() {
		return dates;
	}

	public List<ComicPriceDTO> getPrices() {
		return prices;
	}

	public ImageDTO getThumbnail() {
		return thumbnail;
	}

	public CreatorListDTO getCreators() {
		return creators;
	}

	public CharacterListDTO getCharacters() {
		return characters;
	}

	public StoryListDTO getStories() {
		return stories;
	}

	public EventListDTO getEvents() {
		return events;
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

	public List<ComicSummaryDTO> getItems() {
		return items;
	}

    
   
}
