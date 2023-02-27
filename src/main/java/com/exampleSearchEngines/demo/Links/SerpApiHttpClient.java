package com.exampleSearchEngines.demo.Links;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SerpApiHttpClient {
    public static String BACKEND = "https://serpapi.com/search.json?";
    public String path;

    public SerpApiHttpClient(String path) {
        this.path = path;
    }

    //Build URL

    protected String buildURL(String Path, Map<String, String> parameter) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(BACKEND)
                .queryParam("text", parameter.get("text"))
                .queryParam("engine", parameter.get("engine"))
                .queryParam("api_key", parameter.get("api_key"));

        return builder.toUriString();
    }

    protected List<String> getUrls (String url) throws JsonProcessingException {
        RestTemplate getTemplate = new RestTemplate();
        ResponseEntity<String> response = getTemplate.getForEntity(url, String.class);
        String responseData = response.getBody();


        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(responseData);

        JsonNode organicResultsNode = rootNode.get("organic_results");
        System.out.println(organicResultsNode);

        List<String> urls = new ArrayList<>();

        for (JsonNode resultNode : organicResultsNode) {
            urls.add(resultNode.get("link").asText());
        }

        return urls;
    }



}