package com.itheima.domain;

public class Image {
    private Integer mid;

    private String picture;


    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Image{" +
                "mid=" + mid +
                ", picture='" + picture + '\'' +
                '}';
    }
}
