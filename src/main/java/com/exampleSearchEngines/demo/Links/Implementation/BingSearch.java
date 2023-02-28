package com.exampleSearchEngines.demo.Links.Implementation;

import java.util.Map;

public class BingSearch extends SerpApiSearch {
    public BingSearch(Map<String, String> parameter, String apiKey){
        super("Bing", parameter, apiKey);
    }

    public BingSearch() {
        super("BingSearch");
    }
}