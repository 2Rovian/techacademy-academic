package com.techacademy.academic_service.domain.entities;

import java.math.BigDecimal;
import java.util.List;

public class ReportCard {
    private Long studentId;
    private String studentName;

    private List<Grade> grades;

    private BigDecimal average;

    private String status;

    public ReportCard(){
    }

    public ReportCard(Long id, Long studentId, List<Grade> grades, String studentName, BigDecimal average, String status) {
        this.studentId = studentId;
        this.grades = grades;
        this.studentName = studentName;
        this.average = average;
        this.status = status;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public BigDecimal getAverage() {
        return average;
    }

    public void setAverage(BigDecimal average) {
        this.average = average;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
