package com.example.Url_hit_counter.model;

public class UrlHit {
private String username;
    private int count;

    public UrlHit(String username,int count) {
        this.count = count;
        this.username = username;
    }


    public int getCount() {
        return count;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "UrlHit{" +
                "count=" + count +
                ", username='" + username + '\'' +
                '}';
    }
}
