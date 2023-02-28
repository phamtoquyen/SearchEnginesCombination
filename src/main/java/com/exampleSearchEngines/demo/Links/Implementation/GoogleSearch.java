package com.exampleSearchEngines.demo.Links.Implementation;

import java.util.Map;

public class GoogleSearch extends SerpApiSearch {
    public GoogleSearch(Map<String, String> parameter, String apiKey) {
        super("Google", parameter, apiKey);
    }

    public GoogleSearch() {
        super("Google");
    }
}