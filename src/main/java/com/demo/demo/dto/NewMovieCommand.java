package com.demo.demo.dto;

import com.demo.demo.domain.GenreType;

import java.util.List;

public class NewMovieCommand {

    private String title;
    private String director;
    private Long year;
    private String url;
    private List<GenreType> genreTypes;

    public NewMovieCommand(String title, String director, Long year, String url, List<GenreType> genreTypes) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.url = url;
        this.genreTypes = genreTypes;
    }

    public NewMovieCommand() {
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

    public List<GenreType> getGenreTypes() {
        return genreTypes;
    }

    public void setGenreTypes(List<GenreType> genreTypes) {
        this.genreTypes = genreTypes;
    }
}
