package com.demo.demo.dto;

import java.util.List;

public class FormInitData {

    private List<GenreOptionItem> genres;
    private List<RatingOptionItem> ratings;

    public FormInitData(List<GenreOptionItem> genres, List<RatingOptionItem> ratings) {
        this.genres = genres;
        this.ratings = ratings;
    }

    public List<GenreOptionItem> getGenres() {
        return genres;
    }

    public void setGenres(List<GenreOptionItem> genres) {
        this.genres = genres;
    }

    public List<RatingOptionItem> getRatings() {
        return ratings;
    }

    public void setRatings(List<RatingOptionItem> ratings) {
        this.ratings = ratings;
    }
}
