package com.abrar.openapi.entity;

import java.util.List;

public class News
{
    private String title;
    private String section;
    private List<Results> results ;


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getSection() {
        return section;
    }
    public void setSection(String section) {
        this.section = section;
    }
    public List<Results> getResults() {
        return results;
    }
    public void setResults(List<Results> results) {
        this.results = results;
    }

}
