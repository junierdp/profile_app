package com.junierdp.profileapp;

import java.io.Serializable;

public class Profile implements Serializable {
    String firstName;
    String lastName;
    String username;
    String password;
    String career;
    int universityImage;
    String universityYear;
    int jobImage;
    String jobTitle;
    String jobYear;
    int gitHubRepositories;
    int gitHubStars;
    int gitHubFollowers;

    public Profile(String firstName, String lastName, String username, String password, String career, int universityImage, String universityYear, int jobImage, String jobTitle, String jobYear, int gitHubRepositories, int gitHubStars, int gitHubFollowers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.career = career;
        this.universityImage = universityImage;
        this.universityYear = universityYear;
        this.jobImage = jobImage;
        this.jobTitle = jobTitle;
        this.jobYear = jobYear;
        this.gitHubRepositories = gitHubRepositories;
        this.gitHubStars = gitHubStars;
        this.gitHubFollowers = gitHubFollowers;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String carrer) {
        this.career = carrer;
    }

    public String getUniversityYear() {
        return universityYear;
    }

    public void setUniversityYear(String universityYear) {
        this.universityYear = universityYear;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobPlace(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobYear() {
        return jobYear;
    }

    public void setJobYear(String jobYear) {
        this.jobYear = jobYear;
    }

    public int getGitHubRepositories() {
        return gitHubRepositories;
    }

    public void setGitHubRepositories(int gitHubRepositories) {
        this.gitHubRepositories = gitHubRepositories;
    }

    public int getGitHubStars() {
        return gitHubStars;
    }

    public void setGitHubStars(int gitHubStars) {
        this.gitHubStars = gitHubStars;
    }

    public int getGitHubFollowers() {
        return gitHubFollowers;
    }

    public void setGitHubFollowers(int gitHubFollowers) {
        this.gitHubFollowers = gitHubFollowers;
    }
}
