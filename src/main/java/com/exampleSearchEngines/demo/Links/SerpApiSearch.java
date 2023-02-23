package com.exampleSearchEngines.demo.Links;

import com.google.gson.Gson;

import java.util.Map;

public class SerpApiSearch extends Exception {

    private String api_key;
    private String engine;
    public Map<String, String> parameter;

    public SerpApiSearch(String engine, Map<String, String> parameter, String api_key) {
        this.api_key = api_key;
        this.engine = engine;
        this.parameter = parameter;
    }

}