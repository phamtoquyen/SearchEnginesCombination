package com.exampleSearchEngines.demo.Links.Implementation;

import java.util.Map;

public class YahooSearch extends SerpApiSearch {

    public YahooSearch(Map<String, String> parameter, String apiKey) {
        super("Yahoo", parameter, apiKey);
    }
    public YahooSearch() {
        super("Yahoo");
    }
}