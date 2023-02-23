package com.exampleSearchEngines.demo.Links;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Link {

    @Id
    private String id;
    private boolean valid;
    private int difficulty;
    private int len;
    private String url;

    public Link() {

    }

    public Link(String id, boolean valid, int difficulty, int len, String url) {
        this.id = id;
        this.valid = valid;
        this.difficulty = difficulty;
        this.len = len;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public boolean isValid() {
        return valid;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getLen() {
        return len;
    }

    public String getUrl() {
        return url;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}