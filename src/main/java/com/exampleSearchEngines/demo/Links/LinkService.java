package com.exampleSearchEngines.demo.Links;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LinkService {

    @Autowired
    LinkRepo linkRepo;

    public List<Link> getLinks() {
        List<Link> links = new ArrayList<>();
        linkRepo.findAll().forEach(links::add);
        return links;
    }

    public Optional<Link> getLink(String linkId) {
        return linkRepo.findById(linkId);
    }
    public void addLink(Link newLink) {
        linkRepo.save(newLink);
    }
    public void updateLink(Link newLink) {
        linkRepo.save(newLink);
    }
    public void deleteLink(String linkedId) {
        linkRepo.deleteById(linkedId);
    }
    public void deleteLinks() {
        linkRepo.deleteAll();
    }


    public String getText(String text) {
        return "text + checked!";
    }
}