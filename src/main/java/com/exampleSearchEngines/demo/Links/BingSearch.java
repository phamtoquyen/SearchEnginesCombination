package com.exampleSearchEngines.demo.Links;

import java.util.Map;

public class BingSearch extends SerpApiSearch{
    public BingSearch(Map<String, String> parameter, String apiKey){
        super("Bing", parameter, apiKey);
    }
}