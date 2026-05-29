# SEO Library

A small reusable Java library that helps validate SEO metadata for web pages.

## What this project does

This project provides helper utilities to validate basic SEO elements:

- `MetaTagUtils.isTitleValid(String title)`
  - Checks that a page title is not null and is between 30 and 60 characters.
- `MetaTagUtils.isDescriptionValid(String description)`
  - Checks that a meta description is not null and is between 120 and 160 characters.
- `CanonicalUtils.isCanonicalValid(String canonicalUrl)`
  - Checks that a canonical URL is not null and starts with `https://`.

## Example usage

```java
String title = "Best SEO Automation Testing Library";
boolean validTitle = MetaTagUtils.isTitleValid(title);

boolean canonicalValid = CanonicalUtils.isCanonicalValid("https://example.com");

System.out.println("SEO Title Valid : " + validTitle);
System.out.println("Canonical Valid : " + canonicalValid);
```

## Build & test

Use Maven to build and run tests:

```bash
mvn clean test
```

## Project structure

- `src/main/java/com/seo/`
  - `App.java` — sample application entry point.
  - `MetaTagUtils.java` — SEO meta tag validation helpers.
  - `CanonicalUtils.java` — canonical URL validation helper.
- `src/test/java/com/seo/`
  - `AppTest.java` — project test cases.

## Purpose

This library is intended to support SEO validation and automation testing by providing simple reusable validation helpers for title, description, and canonical URL checks.