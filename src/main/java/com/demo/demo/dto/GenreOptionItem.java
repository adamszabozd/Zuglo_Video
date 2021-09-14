package com.demo.demo.dto;

import com.demo.demo.domain.GenreType;

public class GenreOptionItem {

    private String name;
    private String displayName;

    public GenreOptionItem(GenreType genreType) {
        this.name = genreType.name();
        this.displayName = genreType.getDisplayName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
