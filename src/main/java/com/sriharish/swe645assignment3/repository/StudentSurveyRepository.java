package com.sriharish.swe645assignment3.repository;

import com.sriharish.swe645assignment3.model.StudentSurveyModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentSurveyRepository extends JpaRepository<StudentSurveyModel, Long> {

}
