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

    public List<Grade> getAllGradesByStudentId(Long id){
        return gradeRepository.findByStudentId(id);
    }

    public List<Grade> getAllGradesByStudentIdAndSubject(Long id, String subject) {
        return gradeRepository.findByStudentIdAndSubject(id, subject);
    }
}
