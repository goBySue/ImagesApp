package com.example.imagesapp;

public class Item {

    private String imageUrl;
    private String  tags;
    private int likes;

    public Item(String imageUrl, String tags, int likes) {
        this.imageUrl = imageUrl;
        this.tags = tags;
        this.likes = likes;
    }
    public String getImageUrl() {
        return imageUrl;
    }

    public String getTags() {
        return tags;
    }

    public int getLikes() {
        return likes;
    }

}
