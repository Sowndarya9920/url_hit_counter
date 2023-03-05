package com.example.Url_hit_counter.controller;

import com.example.Url_hit_counter.model.UrlHit;
import com.example.Url_hit_counter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/urlHit-count")
public class UrlHitController {
    @Autowired
    private UrlHitService urlService;

    @GetMapping("/username/{username}/count")
    public UrlHit getCount(@PathVariable String username) {
        UrlHit hit = urlService.getHits(username);
        return hit;
    }
}