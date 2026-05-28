package com.seo;

public class MetaTagUtils {

    public static boolean isTitleValid(String title) {

        return title != null
                && title.length() >= 30
                && title.length() <= 60;
    }

    public static boolean isDescriptionValid(String description) {

        return description != null
                && description.length() >= 120
                && description.length() <= 160;
    }
}