package com.demo.demo.dto;

import com.demo.demo.domain.RatingType;

public class RatingOptionItem {

    private String name;
    private String displayName;

    public RatingOptionItem(RatingType ratingType) {
        this.name = ratingType.name();
        this.displayName = ratingType.getDisplayName();
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
