package com.demo.demo.domain;

import com.demo.demo.dto.NewMovieCommand;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "director")
    private String director;

    @Column(name = "year")
    private Long year;

    @Column(name = "url")
    private String url;

    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = GenreType.class)
    @CollectionTable(name = "movie_genre")
    @Column(name = "movie_genre")
    private List<GenreType> genreTypes = new ArrayList<>();

    public Movie(NewMovieCommand newMovieCommand) {
        this.title = newMovieCommand.getTitle();
        this.director = newMovieCommand.getDirector();
        this.year = newMovieCommand.getYear();
        this.url = newMovieCommand.getUrl();
        this.genreTypes = newMovieCommand.getGenreTypes();
    }

    public Movie() {
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

    public List<GenreType> getGenreTypes() {
        return genreTypes;
    }

    public void setGenreTypes(List<GenreType> genreTypes) {
        this.genreTypes = genreTypes;
    }
}
