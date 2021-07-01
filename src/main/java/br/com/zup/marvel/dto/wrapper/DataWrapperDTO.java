package br.com.zup.marvel.dto.wrapper;

public class DataWrapperDTO<T> {
    private int code;
    private String status;
    private String copyright;
    private String attributionText;
    private String attributionHTML;
    private String etag; //= UUID.randomUUID().toString();
    private DataContainerDTO<T> data;

    public DataWrapperDTO(int code, String status, DataContainerDTO<T> data) {
        this.code = code;
        this.status = status;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getAttributionText() {
        return attributionText;
    }

    public String getAttributionHTML() {
        return attributionHTML;
    }

    public DataContainerDTO<T> getData() {
        return data;
    }

    public String getEtag() {
        return etag;
    }
}
