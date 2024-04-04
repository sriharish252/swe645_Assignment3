package com.sriharish.swe645assignment3.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Data
@Table(name = "studentsurvey")
public class StudentSurveyModel {

    @Id
    @GeneratedValue
    private long id;

    private String firstName;

    private String lastName;

    private String streetAddress;

    private String city;

    private String state;

    private int zipCode;

    private String phoneNumber;

    private String emailId;

    private String dateOfSurvey;

    private String mostLikedAboutCampus;

    private String interestSourceForUniversity;

    private String recommendationLikelihood;

}
