package com.exampleSearchEngines.demo.Links;

import com.google.gson.Gson;
import com.google.gson.JsonArray;

import java.util.HashMap;
import java.util.Map;

public class SerpApiSearch extends Exception {

    private String api_key;
    private String engine;
    private Map<String, String> parameter;


    public String getApi_key() {
        return api_key;
    }

    public String getEngine() {
        return engine;
    }

    public Map<String, String> getParameter() {
        return parameter;
    }


    public SerpApiSearch(String engine, Map<String, String> parameter, String api_key) {
        this.api_key = api_key;
        this.engine = engine;
        this.parameter = parameter;
    }

    public SerpApiSearch(String engine) {
        this.parameter = new HashMap<String, String>();
        this.engine = engine;
    }


}