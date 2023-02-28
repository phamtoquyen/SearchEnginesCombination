package com.exampleSearchEngines.demo.Links.Implementation;

import com.exampleSearchEngines.demo.Links.ILinkService;
import com.exampleSearchEngines.demo.Links.Link;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.*;


public class YandexSearch extends SerpApiSearch implements ILinkService {
    private String api_key = "5a75fdfd76c6f78c70844c65b06f544ab10110b4c1d16507bc1cfe38b9c1f540";
    private class ApiResponse{
        String url;
    }

    public YandexSearch(Map<String, String> parameter, String apiKey) {
        super("yandex", parameter, apiKey);
    }

    public YandexSearch() {
        super("Yandex");
    }

    @Override
    public List<Link> search(String text) throws JsonProcessingException {
        List<String> resultUrls = getLinks(text);
        List<Link> resultLink = new ArrayList<Link>();
        for(String url : resultUrls) {
            Link link = new Link();
            link.setSearchText2(text);
            resultLink.add(link);
        }
        return resultLink;
    }

    public List<String> getLinks(String text) throws JsonProcessingException {
        RestTemplate getTemplate = new RestTemplate();
        String url = "http://yandex.com/search?api_key={api_key}&text={text}";
        Map<String, String> params = new HashMap<>();
        params.put("api_key", this.api_key);
        params.put("text", text);

        String uri = UriComponentsBuilder.fromUriString(url)
                .buildAndExpand(params)
                .toUriString();

        ResponseEntity<String> response = getTemplate.getForEntity(uri, String.class);
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