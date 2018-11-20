package com.junierdp.profileapp;

import java.io.Serializable;

public class Profile implements Serializable {
    private Integer profileImage;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String career;
    private Integer universityImage;
    private String universityYear;
    private Integer jobImage;
    private String jobTitle;
    private String jobYear;
    private int gitHubRepositories;
    private int gitHubStars;
    private int gitHubFollowers;
    private String gitHubLink;

    public Profile(Integer profileImage, String firstName, String lastName, String username, String password, String career, Integer universityImage, String universityYear, Integer jobImage, String jobTitle, String jobYear, int gitHubRepositories, int gitHubStars, int gitHubFollowers, String gitHubLink) {
        this.profileImage = profileImage;
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
        this.gitHubLink = gitHubLink;
    }

    public Integer getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(Integer profileImage) {
        this.profileImage = profileImage;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public Integer getUniversityImage() {
        return universityImage;
    }

    public void setUniversityImage(Integer universityImage) {
        this.universityImage = universityImage;
    }

    public String getUniversityYear() {
        return universityYear;
    }

    public void setUniversityYear(String universityYear) {
        this.universityYear = universityYear;
    }

    public Integer getJobImage() {
        return jobImage;
    }

    public void setJobImage(Integer jobImage) {
        this.jobImage = jobImage;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
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

    public String getGitHubLink() {
        return gitHubLink;
    }

    public void setGitHubLink(String gitHubLink) {
        this.gitHubLink = gitHubLink;
    }
}
