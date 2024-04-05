package com.sriharish.swe645assignment3.controller;

import com.sriharish.swe645assignment3.model.StudentSurveyModel;
import com.sriharish.swe645assignment3.service.StudentSurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/survey")
public class StudentSurveyController {

    @Autowired
    private StudentSurveyService studentSurveyService;

    @GetMapping(path = "/getStudentSurveys")
    public List<StudentSurveyModel> getStudentSurveys() {
        return studentSurveyService.getStudentSurveys();
    }

    @PostMapping(path = "/addStudentSurvey")
    public StudentSurveyModel addStudentSurvey(@RequestBody StudentSurveyModel survey) {
        return studentSurveyService.addStudentSurvey(survey);
    }

    @PutMapping(path = "/updateStudentSurvey/{id}")
    public StudentSurveyModel updateStudentSurvey(@PathVariable long id, @RequestBody StudentSurveyModel studentSurvey) {
        return studentSurveyService.updateStudentSurvey(id, studentSurvey);
    }

    @DeleteMapping(path = "/deleteStudentSurvey/{id}")
    public String deleteStudentSurvey(@PathVariable long id) {
        return studentSurveyService.deleteStudentSurvey(id);
    }
}
