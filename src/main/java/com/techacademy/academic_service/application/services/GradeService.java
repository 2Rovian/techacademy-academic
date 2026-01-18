package com.techacademy.academic_service.application.services;

import com.techacademy.academic_service.domain.entities.Grade;
import com.techacademy.academic_service.domain.repository.GradeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {
    private final GradeRepository gradeRepository;

    public GradeService(GradeRepository gradeRepository){
        this.gradeRepository = gradeRepository;
    }

    public Grade saveGrade(Grade grade) {
        return gradeRepository.save(grade);
    }

//    Grade save(Grade grade);
//    List<Grade> findByStudentId(Long id);
//    List<Grade> findByStudentIdAndSubject(Long id, String subject);
}
