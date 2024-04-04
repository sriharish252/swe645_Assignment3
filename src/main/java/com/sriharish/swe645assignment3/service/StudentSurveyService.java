package com.sriharish.swe645assignment3.service;

import com.sriharish.swe645assignment3.model.StudentSurveyModel;
import com.sriharish.swe645assignment3.repository.StudentSurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentSurveyService {

    @Autowired
    private StudentSurveyRepository studentSurveyRepository;

    public List<StudentSurveyModel> getStudentSurveys() {
        return studentSurveyRepository.findAll();
    }

    public StudentSurveyModel getStudentSurveyById(long id) {
        Optional<StudentSurveyModel> studentSurvey = studentSurveyRepository.findById(id);
        if(studentSurvey.isPresent())
            return studentSurvey.get();
        else
            return null;
    }

    public StudentSurveyModel addStudentSurvey(StudentSurveyModel studentSurvey) {
        return studentSurveyRepository.save(studentSurvey);
    }

    public StudentSurveyModel updateStudentSurvey(long id, StudentSurveyModel studentSurvey) {
        if(studentSurveyRepository.existsById(id)) {
            studentSurvey.setId(id);
            return studentSurveyRepository.save(studentSurvey);
        }
        return null;
    }

    public String deleteStudentSurvey(long id){
        studentSurveyRepository.deleteById(id);
        return "Deletion Successful";
    }


}
