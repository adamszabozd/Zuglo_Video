package com.demo.demo.dto;

import com.demo.demo.domain.GenreType;
import com.demo.demo.domain.Movie;

import java.util.List;
import java.util.stream.Collectors;

public class MovieListItemModel {

    private Long id;
    private String title;
    private String director;
    private Long year;
    private String url;
    private List<GenreOptionItem> genreOptionItems;

    public MovieListItemModel(Movie movie) {
        this.id = movie.getId();
        this.title = movie.getTitle();
        this.director = movie.getDirector();
        this.year = movie.getYear();
        this.url = movie.getUrl();
        this.genreOptionItems = movie.getGenreTypes().stream().map(GenreOptionItem::new).collect(Collectors.toList());
    }

    public MovieListItemModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<GenreOptionItem> getGenreOptionItems() {
        return genreOptionItems;
    }

    public void setGenreOptionItems(List<GenreOptionItem> genreOptionItems) {
        this.genreOptionItems = genreOptionItems;
    }
}
