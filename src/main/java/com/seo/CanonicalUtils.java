package com.seo;

public class CanonicalUtils {

    public static boolean isCanonicalValid(String canonicalUrl) {

        return canonicalUrl != null
                && canonicalUrl.startsWith("https://");
    }
}