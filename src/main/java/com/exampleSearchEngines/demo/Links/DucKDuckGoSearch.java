package com.exampleSearchEngines.demo.Links;

import java.util.Map;

public class DucKDuckGoSearch extends SerpApiSearch{
    public DucKDuckGoSearch(Map<String, String> parameter, String apiKey) {
        super("DuckDuckGo", parameter, apiKey);
    }

    public DucKDuckGoSearch() {
        super("DucKDuckGoSearch");
    }
}