package com.test.testrail.config.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Configuration {

    private String baseUrl;
    private String username;
    private String password;
    private String projectId;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString(){
        return "Configuration:" +
                "\n baseUrl: " + baseUrl +
                "\n username: " + username +
                "\n password: " + password +
                "\n projectId: " + projectId;
    }
}
