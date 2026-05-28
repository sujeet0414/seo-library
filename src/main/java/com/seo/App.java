package com.seo;

public class App {

    public static void main(String[] args) {

        String title =
            "Best SEO Automation Testing Library";

        boolean valid =
            MetaTagUtils.isTitleValid(title);

        boolean canonical =
            CanonicalUtils.isCanonicalValid(
                "https://example.com"
            );

        System.out.println("SEO Title Valid : " + valid);

        System.out.println("Canonical Valid : " + canonical);
    }
}