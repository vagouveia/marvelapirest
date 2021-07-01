package br.com.zup.marvel.dto.wrapper;

import java.util.List;

public class DataContainerDTO<T> {

    private long offset;
    private int limit;
    private long total;
    private int count;
    private List<T> results;

    public DataContainerDTO(long offset, int limit, long total, int count, List<T> results) {
        this.offset = offset;
        this.limit = limit;
        this.total = total;
        this.count = count;
        this.results = results;
    }

    public List<T> getResults() {
        return results;
    }

    public long getOffset() {
        return offset;
    }

    public int getLimit() {
        return limit;
    }

    public long getTotal() {
        return total;
    }

    public int getCount() {
        return count;
    }
}
