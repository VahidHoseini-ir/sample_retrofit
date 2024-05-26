package com.example.sample_retrofit;

import java.util.List;

public class RecipeSearchResult {
    private int count;
    private String next;
    private String previous;
    private List<Recipe> results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<Recipe> getResults() {
        return results;
    }

    public void setResults(List<Recipe> results) {
        this.results = results;
    }

    public static class Recipe {
        private int pk;
        private String title;
        private String publisher;
        private String featured_image;
        private int rating;
        private String source_url;
        private String description;
        private String cooking_instructions;
        private List<String> ingredients;
        private String date_added;
        private String date_updated;
        private long long_date_added;
        private long long_date_updated;

        public int getPk() {
            return pk;
        }

        public void setPk(int pk) {
            this.pk = pk;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getFeatured_image() {
            return featured_image;
        }

        public void setFeatured_image(String featured_image) {
            this.featured_image = featured_image;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public String getSource_url() {
            return source_url;
        }

        public void setSource_url(String source_url) {
            this.source_url = source_url;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCooking_instructions() {
            return cooking_instructions;
        }

        public void setCooking_instructions(String cooking_instructions) {
            this.cooking_instructions = cooking_instructions;
        }

        public List<String> getIngredients() {
            return ingredients;
        }

        public void setIngredients(List<String> ingredients) {
            this.ingredients = ingredients;
        }

        public String getDate_added() {
            return date_added;
        }

        public void setDate_added(String date_added) {
            this.date_added = date_added;
        }

        public String getDate_updated() {
            return date_updated;
        }

        public void setDate_updated(String date_updated) {
            this.date_updated = date_updated;
        }

        public long getLong_date_added() {
            return long_date_added;
        }

        public void setLong_date_added(long long_date_added) {
            this.long_date_added = long_date_added;
        }

        public long getLong_date_updated() {
            return long_date_updated;
        }

        public void setLong_date_updated(long long_date_updated) {
            this.long_date_updated = long_date_updated;
        }
    }



}
