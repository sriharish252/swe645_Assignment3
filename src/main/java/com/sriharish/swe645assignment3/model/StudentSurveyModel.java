// Author: Sri Harish Jayaram
package com.sriharish.swe645assignment3.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;

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

    private String zipCode;

    private String phoneNumber;

    private String emailId;

    private String dateOfSurvey;

    private String mostLikedAboutCampus;

    private String interestSourceForUniversity;

    private String recommendationLikelihood;

}
