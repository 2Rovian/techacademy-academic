package com.techacademy.academic_service.application.services;

import com.techacademy.academic_service.domain.entities.ReportCard;
import com.techacademy.academic_service.domain.repository.GradeRepository;
import com.techacademy.academic_service.domain.services.GradeCalculator;
import org.springframework.stereotype.Service;

@Service
public class ReportCardService {
    private final GradeRepository gradeRepository;
    private final GradeCalculator gradeCalculator;

    public ReportCardService(GradeRepository gradeRepository, GradeCalculator gradeCalculator){
        this.gradeRepository = gradeRepository;
        this.gradeCalculator = gradeCalculator;
    }

    public ReportCard generate(Long studentId) {
        var grades = gradeRepository.findByStudentId(studentId);
        return gradeCalculator.generateReportCard(studentId, grades);
    }
}
