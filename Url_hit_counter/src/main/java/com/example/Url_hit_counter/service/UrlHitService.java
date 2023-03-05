package com.example.Url_hit_counter.service;

import com.example.Url_hit_counter.model.UrlHit;
import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service
public class UrlHitService {
    static HashMap<String, Integer> map = new HashMap<>();

    public UrlHit getHits(String username) {

        int count = map.getOrDefault(username, 0) + 1;
        map.put(username, count);

        UrlHit hits = new UrlHit(username, count);
        return hits;
    }
}
