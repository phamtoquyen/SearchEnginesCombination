package com.exampleSearchEngines.demo.Links;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Link {

    @Id
    private String id;
    private String searchText1;
    private String searchText2;
    private int difficulty;
    private int pageLen;
    private String url;


    public Link() {

    }

    public Link(String id, int difficulty, int len, String url, String searchText1, String searchText2) {
        this.id = id;
        this.difficulty = difficulty;
        this.pageLen = len;
        this.url = url;
        this.searchText1 = searchText1;
        this.searchText2 = searchText2;
    }


    public String getId() {
        return id;
    }

    public String getSearchText1() {
        return searchText1;
    }

    public String getSearchText2() {
        return searchText2;
    }

    public int getPageLen() {
        return pageLen;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public String getUrl() {
        return url;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSearchText1(String searchText1) {
        this.searchText1 = searchText1;
    }

    public void setSearchText2(String searchText2) {
        this.searchText2 = searchText2;
    }

    public void setPageLen(int pageLen) {
        this.pageLen = pageLen;
    }
}