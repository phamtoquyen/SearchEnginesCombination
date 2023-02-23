package com.exampleSearchEngines.demo.Links;

import java.util.Map;

public class YahooSearch extends SerpApiSearch {

    public YahooSearch(Map<String, String> parameter, String apiKey) {
        super("Yahoo", parameter, apiKey);
    }
}