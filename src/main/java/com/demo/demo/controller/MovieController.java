package com.demo.demo.controller;

import com.demo.demo.dto.FormInitData;
import com.demo.demo.dto.MovieListItemModel;
import com.demo.demo.dto.NewMovieCommand;
import com.demo.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/formData")
    public ResponseEntity<FormInitData> getFormInitData() {
        FormInitData formInitData = movieService.getFormInitData();
        return new ResponseEntity<>(formInitData, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Void> createMovie(@RequestBody NewMovieCommand newMovieCommand) {
        movieService.createMovie(newMovieCommand);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping
    public List<MovieListItemModel> fetchAllMovies() {
        return movieService.fetchAllMovies();
    }
}
