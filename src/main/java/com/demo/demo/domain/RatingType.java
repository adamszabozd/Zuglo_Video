package com.demo.demo.domain;

public enum RatingType {

    PG13("PG-13"),
    PG18("PG-18");

    private String displayName;


    RatingType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
