package com.techacademy.academic_service.domain.services;

import com.techacademy.academic_service.domain.entities.Grade;
import com.techacademy.academic_service.domain.entities.ReportCard;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Service
public class GradeCalculator {

    public ReportCard generateReportCard(Long studentId, String studentName, List<Grade> grades) {
        BigDecimal average = calculateAverage(grades);
        String status = average.compareTo(BigDecimal.valueOf(6)) >= 0 ? "APPROVED" : "REPROVED";
        return new ReportCard(studentId, grades, studentName, average, status);
    }

    private BigDecimal calculateAverage(List<Grade> grades) {
        return grades.stream()
                .map(Grade::getValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .divide(BigDecimal.valueOf(grades.size()), 2, RoundingMode.HALF_UP);
    }
}
