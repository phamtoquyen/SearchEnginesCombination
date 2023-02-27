package com.exampleSearchEngines.demo.Links;

import java.util.Map;

public class YandexSearch extends SerpApiSearch{
    public YandexSearch(Map<String, String> parameter, String apiKey) {
        super("yandex", parameter, apiKey);
    }

    public YandexSearch() {
        super("Yandex");
    }

}