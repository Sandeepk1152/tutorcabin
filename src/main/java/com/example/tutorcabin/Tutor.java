package com.example.tutorcabin;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "tutor")
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "img")
    private byte[] profileImage;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "title")
    private String title;

    @Column(name = "rating")
    private int rating;

    @Column(name = "summary")
    private String summmary;

    @Column(name = "bio")
    private String bio;

    @Column(name = "subjects")
    private String subjects;

    @Column(name = "location")
    private String location;

    @Column(name = "school")
    private String Schools;

    @Column(name = "rate")
    private double hourlyRate;

    @Column(name = "level")
    private String studentlevel;

    @Column(name = "mobno")
    private int mobileNumber;

    public Tutor() {
    }

    public Tutor(byte[] profileImage, String username, String email, String password, String title, int rating, String summmary, String bio, String subjects, String location, String schools, double hourlyRate, String studentlevel, int mobileNumber) {
        this.profileImage = profileImage;
        this.username = username;
        this.email = email;
        this.password = password;
        this.title = title;
        this.rating = rating;
        this.summmary = summmary;
        this.bio = bio;
        this.subjects = subjects;
        this.location = location;
        Schools = schools;
        this.hourlyRate = hourlyRate;
        this.studentlevel = studentlevel;
        this.mobileNumber = mobileNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(byte[] profileImage) {
        this.profileImage = profileImage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getSummmary() {
        return summmary;
    }

    public void setSummmary(String summmary) {
        this.summmary = summmary;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSchools() {
        return Schools;
    }

    public void setSchools(String schools) {
        Schools = schools;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getStudentlevel() {
        return studentlevel;
    }

    public void setStudentlevel(String studentlevel) {
        this.studentlevel = studentlevel;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
