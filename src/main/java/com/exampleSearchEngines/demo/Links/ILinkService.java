package com.exampleSearchEngines.demo.Links;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface ILinkService {
    public List<Link> search(String text) throws JsonProcessingException;
}