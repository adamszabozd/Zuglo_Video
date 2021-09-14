package com.demo.demo.domain;

public enum GenreType {
    ACTION("Action"),
    DRAMA("Drama"),
    HORROR("Horror"),
    SCIFI("Sci-Fi");

    private String displayName;

    GenreType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
