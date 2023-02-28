package com.exampleSearchEngines.demo.Links;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LinkController{

    @Autowired
    LinkService linkService;

    @Autowired
    ILinkResource linkResource;



    //GET: return all urls
    @RequestMapping("/links")
    public List<Link> getLinks() {
        return linkService.getLinks();
    }

    //GET: return url given id
    @RequestMapping("/links/{linkId}")
    public Optional<Link> getLink(@PathVariable String linkId) {
        return linkService.getLink(linkId);
    }

    //POST: add a new url into the list
    @RequestMapping(value = "/links", method = RequestMethod.POST)
    public void addLink(@RequestBody Link newLink) {
        linkService.addLink(newLink);
    }

    //PUT: update a link given its id
    @RequestMapping(value = "/links/{linkId}", method = RequestMethod.PUT)
    public void update(@RequestBody Link newLink, @PathVariable String linkId) {
        linkService.updateLink(newLink);
    }

    //DELETE: delete a url given its id
    @RequestMapping(value = "/links/{linkId}", method = RequestMethod.DELETE)
    public void deleteLink(@PathVariable String linkId) {
        linkService.deleteLink(linkId);
    }

    //DELETE: delete all urls
    @RequestMapping(value = "/links", method = RequestMethod.DELETE)
    public void deleteLinks() {
        linkService.deleteLinks();
    }

    //GET: return a list of List<LinkDomain> when given a text
    @RequestMapping("/search/{text}")
    public ResponseEntity<List<Link>> getLinks(@PathVariable String text){
        List<Link> list = linkResource.search(text);
        return (ResponseEntity<List<Link>>) list;
    }



}