package com.demo.demo.service;

import com.demo.demo.domain.GenreType;
import com.demo.demo.domain.Movie;
import com.demo.demo.domain.RatingType;
import com.demo.demo.dto.*;
import com.demo.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.StyledEditorKit;
import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class MovieService {

    private MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public FormInitData getFormInitData() {
        return new FormInitData(
                Arrays.stream(GenreType.values()).map(GenreOptionItem::new).collect(Collectors.toList()),
                Arrays.stream(RatingType.values()).map(RatingOptionItem::new).collect(Collectors.toList())
        );
    }

    public void createMovie(NewMovieCommand newMovieCommand) {
        movieRepository.save(new Movie(newMovieCommand));
    }

    public List<MovieListItemModel> fetchAllMovies() {
        return movieRepository.findAll().stream().map(MovieListItemModel::new).collect(Collectors.toList());
    }
}
