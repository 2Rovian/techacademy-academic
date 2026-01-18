package com.techacademy.academic_service.domain.entities;

import java.math.BigDecimal;

public class Grade {
    private Long id;
    private Long studentId;
    private String subject;
    private BigDecimal value;

    public Grade(){
    }

    public Grade(Long id, Long studentId, String subject, BigDecimal value) {
        this.id = id;
        this.studentId = studentId;
        this.subject = subject;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
